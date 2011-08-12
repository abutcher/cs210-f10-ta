grammar CS210_V1;

options {
  language = Java;
}

@header {
	package edu.wvu.mix.abutcher;
  import edu.wvu.mix.abutcher.Statement.*;
  import java.io.FileReader;
}

@lexer::header {
	package edu.wvu.mix.abutcher;
}

rule returns [Statement st]
  :
  (
    admin_statement EL { $st = $admin_statement.st; }
    | ddl_statement EL { $st = $ddl_statement.st; }
    | dml_statement EL { $st = $dml_statement.st; }
    | query_statement EL { $st = $query_statement.st; } )+
  ;

// admin statements do administrative tasks

admin_statement returns [Statement st]
  :
  exit { $st = $exit.st; }
  | print { $st = $print.st; }
  | read { $st = $read.st; }
  | load { $st = $load.st; }
  | backup { $st = $backup.st; }
  ;

print returns [Statement st]
  :
  'PRINT' 'DICTIONARY'
  | 'PRINT' table_name
  { $st = new PrintStatement(); }
  ;

exit returns [Statement st]
  :
  'EXIT'
  {$st = new ExitStatement();}
  ;

read returns [Statement st]
  :
  'READ' STRING_LITERAL
  { $st = new ReadStatement($STRING_LITERAL.text); }	
  ;

load returns [Statement st]
  :
  'LOAD' STRING_LITERAL
  { $st = new LoadStatement(); }
  ;

backup returns [Statement st]
  :
  'BACKUP' 'TO' STRING_LITERAL
  { $st = new BackupStatement(); }
  ;

// data definition languages -- refers to the structure of the tables

ddl_statement returns [Statement st]
  :
  define { $st = $define.st; }
  | rename { $st = $rename.st; }
  | drop { $st = $drop.st; }
  | define_index { $st = $define_index.st; }
  ;

define returns [Statement st]
  :
  'DEFINE' 'TABLE' table_name 'HAVING' 'FIELDS' '(' field_name TYPE (COMMA field_name TYPE)* ')'
  { $st = new DefineStatement(); }
  ;

rename returns [Statement st]
  :
  'RENAME' 'TABLE' table_name 'TO' table_name
  { $st = new RenameStatement(); }
  ;

drop returns [Statement st]
  :
  'DROP' 'TABLE' table_name
  { $st = new DropStatement(); }
  ;

define_index returns [Statement st]
  :
  'DEFINE' 'INDEX' 'ON' table_name '(' field_name ')'
  { $st = new DefineIndexStatement(); }
  ;

// data manipulation languages -- refers to adding or removing data

dml_statement returns [Statement st]
  :
  delete { $st = $delete.st; }
  | insert { $st = $insert.st; }
  | update { $st = $update.st; }
  ;

delete returns [Statement st]
  :
  'DELETE' table_name ('WHERE' expression)?
  { $st = new DeleteStatement();}
  ;

insert returns [Statement st]
  :
  'INSERT' '(' expression_list ')' 'INTO' table_name
  { $st = new InsertStatement(); }
  ;

update returns [Statement st]
  :
  'UPDATE' table_name 'SET' field_name EQUALS expression (COMMA field_name EQUALS expression)* ('WHERE' expression)?
  { $st = new UpdateStatement(); }
  ;

// getting appropriate data out of the database...

query_statement returns [Statement st]
  :
  selection {$st = $selection.st; }
  | projection {$st = $projection.st; }
  | join {$st = $join.st; }
  | intersection {$st = $intersection.st; }
  | union {$st = $union.st; }
  | minus {$st = $minus.st; }
  ;

selection returns [Statement st]
  :
  'SELECT' query_list ('WHERE' expression)?
  {$st = new SelectStatement(); }
  ;

projection returns [Statement st]
  :
  'PROJECT' query_list 'OVER' field_list
  {$st = new OtherStatement(); }
  ;

join returns [Statement st]
  :
  'JOIN' query_list 'AND' query_list
  {$st = new OtherStatement(); }
  ;

intersection returns [Statement st]
  :
  'INTERSECT' query_list 'AND' query_list
  {$st = new OtherStatement(); }
  ;

union returns [Statement st]
  :
  'UNION' query_list 'AND' query_list
  {$st = new OtherStatement(); }
  ;

minus returns [Statement st]
  :
  'MINUS' query_list 'AND' query_list
  {$st = new OtherStatement(); }
  ;

value
  :
  INTEGER
  | DATE
  | REAL
  | STRING_LITERAL
  | BOOLEAN
  | NULL
  ;

table_name
  :
  IDENT
  ;

field_name
  :
  IDENT
  ;

field_list
  :
  field_name (COMMA field_name)*
  ;

query_list
  :
  table_name
  | '(' query_statement ')'
  ;

term
  :
  value
  | '(' expression ')'
  | IDENT
  ;

negation
  :
  'not'* term
  ;

unary
  :
  ADDOP* negation
  ;

mult
  :
  unary (MULTOP unary)*
  ;

arith
  :
  mult (ADDOP mult)*
  ;

relation
  :
  arith (relational_operator arith)*
  ;

expression
  :
  relation
  (
    (
      AND
      | OR
    )
    relation
  )*
  ;

expression_list
  :
  expression (COMMA expression)*
  ;

relational_operator
  :
  EQUALS
  | RELOP
  ;

// tokens
// fragment means they're only used as components of tokens in the final compile

fragment
DIGIT
  :
  '0'..'9'
  ;

fragment
LETTER
  :
  'a'..'z'
  | 'A'..'Z'
  ;

fragment
SPECCHAR
  :
  '_'
  | '$'
  ;

PERIOD
  :
  '.'
  ;

COMMA
  :
  ','
  ;

EL
  :
  ';'
  ;

EQUALS
  :
  '='
  ;

RELOP
  :
  '<='
  | '>='
  | '<'
  | '>'
  | '='
  ;

ADDOP
  :
  '+'
  | '-'
  ;

MULTOP
  :
  '*'
  | '/'
  | '\%'
  ;

TYPE
  :
  'VARCHAR'
  | 'REAL'
  | 'INTEGER'
  | 'DATE'
  | 'CHAR([0-9]+)'
  | 'BOOLEAN'
  ;

BOOLEAN
  :
  'TRUE'
  | 'FALSE'
  ;

AND
  :
  'AND'
  ;

OR
  :
  'OR'
  ;

NULL
  :
  'NULL'
  ;

INTEGER
  :
  DIGIT+
  ;

DATE
  :
  '\'' DIGIT DIGIT '/' DIGIT DIGIT '/' DIGIT DIGIT DIGIT DIGIT '\''
  ;

STRING_LITERAL
  :
  '\'' .* '\''
  ;

REAL
  :
  DIGIT+ (PERIOD (DIGIT)*)?
  ;

IDENT
  :
  (SPECCHAR)? LETTER
  (
    LETTER
    | DIGIT
    | SPECCHAR
  )*
  ;

WS
  :
  (
    ' '
    | '\t'
    | '\n'
    | '\r'
    | '\f'
  )+
  
  {
   $channel = HIDDEN;
  }
  ;

COMMENT
  :
  '//' .*
  (
    '\n'
    | '\r'
  )
  
  {
   $channel = HIDDEN;
  }
  ;
