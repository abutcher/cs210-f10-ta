// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g 2010-09-08 10:23:46

package edu.wvu.mix.abutcher;
  import edu.wvu.mix.abutcher.Statement.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CS210_V1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EL", "STRING_LITERAL", "TYPE", "COMMA", "EQUALS", "INTEGER", "DATE", "REAL", "BOOLEAN", "NULL", "IDENT", "ADDOP", "MULTOP", "AND", "OR", "RELOP", "DIGIT", "LETTER", "SPECCHAR", "PERIOD", "WS", "COMMENT", "'PRINT'", "'DICTIONARY'", "'EXIT'", "'READ'", "'LOAD'", "'BACKUP'", "'TO'", "'DEFINE'", "'TABLE'", "'HAVING'", "'FIELDS'", "'('", "')'", "'RENAME'", "'DROP'", "'INDEX'", "'ON'", "'DELETE'", "'WHERE'", "'INSERT'", "'INTO'", "'UPDATE'", "'SET'", "'SELECT'", "'PROJECT'", "'OVER'", "'JOIN'", "'INTERSECT'", "'UNION'", "'MINUS'", "'not'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int LETTER=21;
    public static final int SPECCHAR=22;
    public static final int EQUALS=8;
    public static final int ADDOP=15;
    public static final int AND=17;
    public static final int EOF=-1;
    public static final int TYPE=6;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__51=51;
    public static final int STRING_LITERAL=5;
    public static final int BOOLEAN=12;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int MULTOP=16;
    public static final int COMMA=7;
    public static final int IDENT=14;
    public static final int DIGIT=20;
    public static final int COMMENT=25;
    public static final int T__50=50;
    public static final int EL=4;
    public static final int T__42=42;
    public static final int INTEGER=9;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int PERIOD=23;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NULL=13;
    public static final int T__30=30;
    public static final int REAL=11;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=24;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int OR=18;
    public static final int DATE=10;
    public static final int RELOP=19;

    // delegates
    // delegators


        public CS210_V1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CS210_V1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CS210_V1Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g"; }



    // $ANTLR start "rule"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:18:1: rule returns [Statement st] : ( admin_statement EL | ddl_statement EL | dml_statement EL | query_statement EL )+ ;
    public final Statement rule() throws RecognitionException {
        Statement st = null;

        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:19:3: ( ( admin_statement EL | ddl_statement EL | dml_statement EL | query_statement EL )+ )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:20:3: ( admin_statement EL | ddl_statement EL | dml_statement EL | query_statement EL )+
            {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:20:3: ( admin_statement EL | ddl_statement EL | dml_statement EL | query_statement EL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 26:
                case 28:
                case 29:
                case 30:
                case 31:
                    {
                    alt1=1;
                    }
                    break;
                case 33:
                case 39:
                case 40:
                    {
                    alt1=2;
                    }
                    break;
                case 43:
                case 45:
                case 47:
                    {
                    alt1=3;
                    }
                    break;
                case 49:
                case 50:
                case 52:
                case 53:
                case 54:
                case 55:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:21:5: admin_statement EL
            	    {
            	    pushFollow(FOLLOW_admin_statement_in_rule55);
            	    admin_statement();

            	    state._fsp--;

            	    match(input,EL,FOLLOW_EL_in_rule57); 

            	                           st = new OtherStatement();
            	                          

            	    }
            	    break;
            	case 2 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:25:7: ddl_statement EL
            	    {
            	    pushFollow(FOLLOW_ddl_statement_in_rule90);
            	    ddl_statement();

            	    state._fsp--;

            	    match(input,EL,FOLLOW_EL_in_rule92); 

            	                           st = new OtherStatement();
            	                          

            	    }
            	    break;
            	case 3 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:29:7: dml_statement EL
            	    {
            	    pushFollow(FOLLOW_dml_statement_in_rule125);
            	    dml_statement();

            	    state._fsp--;

            	    match(input,EL,FOLLOW_EL_in_rule127); 

            	                           st = new OtherStatement();
            	                          

            	    }
            	    break;
            	case 4 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:33:7: query_statement EL
            	    {
            	    pushFollow(FOLLOW_query_statement_in_rule160);
            	    query_statement();

            	    state._fsp--;

            	    match(input,EL,FOLLOW_EL_in_rule162); 

            	                             st = new SelectStatement();
            	                            

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return st;
    }
    // $ANTLR end "rule"


    // $ANTLR start "admin_statement"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:42:1: admin_statement : ( exit | print | read | load | backup );
    public final void admin_statement() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:43:3: ( exit | print | read | load | backup )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:44:3: exit
                    {
                    pushFollow(FOLLOW_exit_in_admin_statement211);
                    exit();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:45:5: print
                    {
                    pushFollow(FOLLOW_print_in_admin_statement217);
                    print();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:46:5: read
                    {
                    pushFollow(FOLLOW_read_in_admin_statement223);
                    read();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:47:5: load
                    {
                    pushFollow(FOLLOW_load_in_admin_statement229);
                    load();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:48:5: backup
                    {
                    pushFollow(FOLLOW_backup_in_admin_statement235);
                    backup();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "admin_statement"


    // $ANTLR start "print"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:51:1: print : ( 'PRINT' 'DICTIONARY' | 'PRINT' table_name );
    public final void print() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:52:3: ( 'PRINT' 'DICTIONARY' | 'PRINT' table_name )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==27) ) {
                    alt3=1;
                }
                else if ( (LA3_1==IDENT) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:53:3: 'PRINT' 'DICTIONARY'
                    {
                    match(input,26,FOLLOW_26_in_print250); 
                    match(input,27,FOLLOW_27_in_print252); 

                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:54:5: 'PRINT' table_name
                    {
                    match(input,26,FOLLOW_26_in_print258); 
                    pushFollow(FOLLOW_table_name_in_print260);
                    table_name();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "print"


    // $ANTLR start "exit"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:57:1: exit : 'EXIT' ;
    public final void exit() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:58:3: ( 'EXIT' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:59:3: 'EXIT'
            {
            match(input,28,FOLLOW_28_in_exit275); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exit"


    // $ANTLR start "read"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:62:1: read : 'READ' STRING_LITERAL ;
    public final void read() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:63:3: ( 'READ' STRING_LITERAL )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:64:3: 'READ' STRING_LITERAL
            {
            match(input,29,FOLLOW_29_in_read290); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_read292); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "read"


    // $ANTLR start "load"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:67:1: load : 'LOAD' STRING_LITERAL ;
    public final void load() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:68:3: ( 'LOAD' STRING_LITERAL )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:69:3: 'LOAD' STRING_LITERAL
            {
            match(input,30,FOLLOW_30_in_load307); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_load309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "load"


    // $ANTLR start "backup"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:72:1: backup : 'BACKUP' 'TO' STRING_LITERAL ;
    public final void backup() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:73:3: ( 'BACKUP' 'TO' STRING_LITERAL )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:74:3: 'BACKUP' 'TO' STRING_LITERAL
            {
            match(input,31,FOLLOW_31_in_backup324); 
            match(input,32,FOLLOW_32_in_backup326); 
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_backup328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "backup"


    // $ANTLR start "ddl_statement"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:79:1: ddl_statement : ( define | rename | drop | define_index );
    public final void ddl_statement() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:80:3: ( define | rename | drop | define_index )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==34) ) {
                    alt4=1;
                }
                else if ( (LA4_1==41) ) {
                    alt4=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:81:3: define
                    {
                    pushFollow(FOLLOW_define_in_ddl_statement345);
                    define();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:82:5: rename
                    {
                    pushFollow(FOLLOW_rename_in_ddl_statement351);
                    rename();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:83:5: drop
                    {
                    pushFollow(FOLLOW_drop_in_ddl_statement357);
                    drop();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:84:5: define_index
                    {
                    pushFollow(FOLLOW_define_index_in_ddl_statement363);
                    define_index();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ddl_statement"


    // $ANTLR start "define"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:87:1: define : 'DEFINE' 'TABLE' table_name 'HAVING' 'FIELDS' '(' field_name TYPE ( COMMA field_name TYPE )* ')' ;
    public final void define() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:88:3: ( 'DEFINE' 'TABLE' table_name 'HAVING' 'FIELDS' '(' field_name TYPE ( COMMA field_name TYPE )* ')' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:89:3: 'DEFINE' 'TABLE' table_name 'HAVING' 'FIELDS' '(' field_name TYPE ( COMMA field_name TYPE )* ')'
            {
            match(input,33,FOLLOW_33_in_define378); 
            match(input,34,FOLLOW_34_in_define380); 
            pushFollow(FOLLOW_table_name_in_define382);
            table_name();

            state._fsp--;

            match(input,35,FOLLOW_35_in_define384); 
            match(input,36,FOLLOW_36_in_define386); 
            match(input,37,FOLLOW_37_in_define388); 
            pushFollow(FOLLOW_field_name_in_define390);
            field_name();

            state._fsp--;

            match(input,TYPE,FOLLOW_TYPE_in_define392); 
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:89:69: ( COMMA field_name TYPE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:89:70: COMMA field_name TYPE
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_define395); 
            	    pushFollow(FOLLOW_field_name_in_define397);
            	    field_name();

            	    state._fsp--;

            	    match(input,TYPE,FOLLOW_TYPE_in_define399); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,38,FOLLOW_38_in_define403); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "define"


    // $ANTLR start "rename"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:92:1: rename : 'RENAME' 'TABLE' table_name 'TO' table_name ;
    public final void rename() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:93:3: ( 'RENAME' 'TABLE' table_name 'TO' table_name )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:94:3: 'RENAME' 'TABLE' table_name 'TO' table_name
            {
            match(input,39,FOLLOW_39_in_rename418); 
            match(input,34,FOLLOW_34_in_rename420); 
            pushFollow(FOLLOW_table_name_in_rename422);
            table_name();

            state._fsp--;

            match(input,32,FOLLOW_32_in_rename424); 
            pushFollow(FOLLOW_table_name_in_rename426);
            table_name();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rename"


    // $ANTLR start "drop"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:97:1: drop : 'DROP' 'TABLE' table_name ;
    public final void drop() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:98:3: ( 'DROP' 'TABLE' table_name )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:99:3: 'DROP' 'TABLE' table_name
            {
            match(input,40,FOLLOW_40_in_drop441); 
            match(input,34,FOLLOW_34_in_drop443); 
            pushFollow(FOLLOW_table_name_in_drop445);
            table_name();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "drop"


    // $ANTLR start "define_index"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:102:1: define_index : 'DEFINE' 'INDEX' 'ON' table_name '(' field_name ')' ;
    public final void define_index() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:103:3: ( 'DEFINE' 'INDEX' 'ON' table_name '(' field_name ')' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:104:3: 'DEFINE' 'INDEX' 'ON' table_name '(' field_name ')'
            {
            match(input,33,FOLLOW_33_in_define_index460); 
            match(input,41,FOLLOW_41_in_define_index462); 
            match(input,42,FOLLOW_42_in_define_index464); 
            pushFollow(FOLLOW_table_name_in_define_index466);
            table_name();

            state._fsp--;

            match(input,37,FOLLOW_37_in_define_index468); 
            pushFollow(FOLLOW_field_name_in_define_index470);
            field_name();

            state._fsp--;

            match(input,38,FOLLOW_38_in_define_index472); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "define_index"


    // $ANTLR start "dml_statement"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:109:1: dml_statement : ( delete | insert | update );
    public final void dml_statement() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:110:3: ( delete | insert | update )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt6=1;
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case 47:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:111:3: delete
                    {
                    pushFollow(FOLLOW_delete_in_dml_statement489);
                    delete();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:112:5: insert
                    {
                    pushFollow(FOLLOW_insert_in_dml_statement495);
                    insert();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:113:5: update
                    {
                    pushFollow(FOLLOW_update_in_dml_statement501);
                    update();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dml_statement"


    // $ANTLR start "delete"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:116:1: delete : 'DELETE' table_name ( 'WHERE' expression )? ;
    public final void delete() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:117:3: ( 'DELETE' table_name ( 'WHERE' expression )? )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:118:3: 'DELETE' table_name ( 'WHERE' expression )?
            {
            match(input,43,FOLLOW_43_in_delete516); 
            pushFollow(FOLLOW_table_name_in_delete518);
            table_name();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:118:23: ( 'WHERE' expression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:118:24: 'WHERE' expression
                    {
                    match(input,44,FOLLOW_44_in_delete521); 
                    pushFollow(FOLLOW_expression_in_delete523);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "delete"


    // $ANTLR start "insert"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:121:1: insert : 'INSERT' '(' expression_list ')' 'INTO' table_name ;
    public final void insert() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:122:3: ( 'INSERT' '(' expression_list ')' 'INTO' table_name )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:123:3: 'INSERT' '(' expression_list ')' 'INTO' table_name
            {
            match(input,45,FOLLOW_45_in_insert540); 
            match(input,37,FOLLOW_37_in_insert542); 
            pushFollow(FOLLOW_expression_list_in_insert544);
            expression_list();

            state._fsp--;

            match(input,38,FOLLOW_38_in_insert546); 
            match(input,46,FOLLOW_46_in_insert548); 
            pushFollow(FOLLOW_table_name_in_insert550);
            table_name();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "insert"


    // $ANTLR start "update"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:126:1: update : 'UPDATE' table_name 'SET' field_name EQUALS expression ( COMMA field_name EQUALS expression )* ( 'WHERE' expression )? ;
    public final void update() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:127:3: ( 'UPDATE' table_name 'SET' field_name EQUALS expression ( COMMA field_name EQUALS expression )* ( 'WHERE' expression )? )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:128:3: 'UPDATE' table_name 'SET' field_name EQUALS expression ( COMMA field_name EQUALS expression )* ( 'WHERE' expression )?
            {
            match(input,47,FOLLOW_47_in_update565); 
            pushFollow(FOLLOW_table_name_in_update567);
            table_name();

            state._fsp--;

            match(input,48,FOLLOW_48_in_update569); 
            pushFollow(FOLLOW_field_name_in_update571);
            field_name();

            state._fsp--;

            match(input,EQUALS,FOLLOW_EQUALS_in_update573); 
            pushFollow(FOLLOW_expression_in_update575);
            expression();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:128:58: ( COMMA field_name EQUALS expression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:128:59: COMMA field_name EQUALS expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_update578); 
            	    pushFollow(FOLLOW_field_name_in_update580);
            	    field_name();

            	    state._fsp--;

            	    match(input,EQUALS,FOLLOW_EQUALS_in_update582); 
            	    pushFollow(FOLLOW_expression_in_update584);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:128:96: ( 'WHERE' expression )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:128:97: 'WHERE' expression
                    {
                    match(input,44,FOLLOW_44_in_update589); 
                    pushFollow(FOLLOW_expression_in_update591);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "update"


    // $ANTLR start "query_statement"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:133:1: query_statement : ( selection | projection | join | intersection | union | minus );
    public final void query_statement() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:134:3: ( selection | projection | join | intersection | union | minus )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt10=1;
                }
                break;
            case 50:
                {
                alt10=2;
                }
                break;
            case 52:
                {
                alt10=3;
                }
                break;
            case 53:
                {
                alt10=4;
                }
                break;
            case 54:
                {
                alt10=5;
                }
                break;
            case 55:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:135:3: selection
                    {
                    pushFollow(FOLLOW_selection_in_query_statement610);
                    selection();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:136:5: projection
                    {
                    pushFollow(FOLLOW_projection_in_query_statement616);
                    projection();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:137:5: join
                    {
                    pushFollow(FOLLOW_join_in_query_statement622);
                    join();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:138:5: intersection
                    {
                    pushFollow(FOLLOW_intersection_in_query_statement628);
                    intersection();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:139:5: union
                    {
                    pushFollow(FOLLOW_union_in_query_statement634);
                    union();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:140:5: minus
                    {
                    pushFollow(FOLLOW_minus_in_query_statement640);
                    minus();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "query_statement"


    // $ANTLR start "selection"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:143:1: selection : 'SELECT' query_list ( 'WHERE' expression )? ;
    public final void selection() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:144:3: ( 'SELECT' query_list ( 'WHERE' expression )? )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:145:3: 'SELECT' query_list ( 'WHERE' expression )?
            {
            match(input,49,FOLLOW_49_in_selection655); 
            pushFollow(FOLLOW_query_list_in_selection657);
            query_list();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:145:23: ( 'WHERE' expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:145:24: 'WHERE' expression
                    {
                    match(input,44,FOLLOW_44_in_selection660); 
                    pushFollow(FOLLOW_expression_in_selection662);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "selection"


    // $ANTLR start "projection"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:148:1: projection : 'PROJECT' query_list 'OVER' field_list ;
    public final void projection() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:149:3: ( 'PROJECT' query_list 'OVER' field_list )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:150:3: 'PROJECT' query_list 'OVER' field_list
            {
            match(input,50,FOLLOW_50_in_projection679); 
            pushFollow(FOLLOW_query_list_in_projection681);
            query_list();

            state._fsp--;

            match(input,51,FOLLOW_51_in_projection683); 
            pushFollow(FOLLOW_field_list_in_projection685);
            field_list();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "projection"


    // $ANTLR start "join"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:153:1: join : 'JOIN' query_list 'AND' query_list ;
    public final void join() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:154:3: ( 'JOIN' query_list 'AND' query_list )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:155:3: 'JOIN' query_list 'AND' query_list
            {
            match(input,52,FOLLOW_52_in_join700); 
            pushFollow(FOLLOW_query_list_in_join702);
            query_list();

            state._fsp--;

            match(input,AND,FOLLOW_AND_in_join704); 
            pushFollow(FOLLOW_query_list_in_join706);
            query_list();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "join"


    // $ANTLR start "intersection"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:158:1: intersection : 'INTERSECT' query_list 'AND' query_list ;
    public final void intersection() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:159:3: ( 'INTERSECT' query_list 'AND' query_list )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:160:3: 'INTERSECT' query_list 'AND' query_list
            {
            match(input,53,FOLLOW_53_in_intersection721); 
            pushFollow(FOLLOW_query_list_in_intersection723);
            query_list();

            state._fsp--;

            match(input,AND,FOLLOW_AND_in_intersection725); 
            pushFollow(FOLLOW_query_list_in_intersection727);
            query_list();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "intersection"


    // $ANTLR start "union"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:163:1: union : 'UNION' query_list 'AND' query_list ;
    public final void union() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:164:3: ( 'UNION' query_list 'AND' query_list )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:165:3: 'UNION' query_list 'AND' query_list
            {
            match(input,54,FOLLOW_54_in_union742); 
            pushFollow(FOLLOW_query_list_in_union744);
            query_list();

            state._fsp--;

            match(input,AND,FOLLOW_AND_in_union746); 
            pushFollow(FOLLOW_query_list_in_union748);
            query_list();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "union"


    // $ANTLR start "minus"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:168:1: minus : 'MINUS' query_list 'AND' query_list ;
    public final void minus() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:169:3: ( 'MINUS' query_list 'AND' query_list )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:170:3: 'MINUS' query_list 'AND' query_list
            {
            match(input,55,FOLLOW_55_in_minus763); 
            pushFollow(FOLLOW_query_list_in_minus765);
            query_list();

            state._fsp--;

            match(input,AND,FOLLOW_AND_in_minus767); 
            pushFollow(FOLLOW_query_list_in_minus769);
            query_list();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "minus"


    // $ANTLR start "value"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:173:1: value : ( INTEGER | DATE | REAL | STRING_LITERAL | BOOLEAN | NULL );
    public final void value() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:174:3: ( INTEGER | DATE | REAL | STRING_LITERAL | BOOLEAN | NULL )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:
            {
            if ( input.LA(1)==STRING_LITERAL||(input.LA(1)>=INTEGER && input.LA(1)<=NULL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "value"


    // $ANTLR start "table_name"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:183:1: table_name : IDENT ;
    public final void table_name() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:184:3: ( IDENT )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:185:3: IDENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_table_name829); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "table_name"


    // $ANTLR start "field_name"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:188:1: field_name : IDENT ;
    public final void field_name() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:189:3: ( IDENT )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:190:3: IDENT
            {
            match(input,IDENT,FOLLOW_IDENT_in_field_name844); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "field_name"


    // $ANTLR start "field_list"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:193:1: field_list : field_name ( COMMA field_name )* ;
    public final void field_list() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:194:3: ( field_name ( COMMA field_name )* )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:195:3: field_name ( COMMA field_name )*
            {
            pushFollow(FOLLOW_field_name_in_field_list859);
            field_name();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:195:14: ( COMMA field_name )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:195:15: COMMA field_name
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_field_list862); 
            	    pushFollow(FOLLOW_field_name_in_field_list864);
            	    field_name();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "field_list"


    // $ANTLR start "query_list"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:198:1: query_list : ( table_name | '(' query_statement ')' );
    public final void query_list() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:199:3: ( table_name | '(' query_statement ')' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENT) ) {
                alt13=1;
            }
            else if ( (LA13_0==37) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:200:3: table_name
                    {
                    pushFollow(FOLLOW_table_name_in_query_list881);
                    table_name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:201:5: '(' query_statement ')'
                    {
                    match(input,37,FOLLOW_37_in_query_list887); 
                    pushFollow(FOLLOW_query_statement_in_query_list889);
                    query_statement();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_query_list891); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "query_list"


    // $ANTLR start "term"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:204:1: term : ( value | '(' expression ')' | IDENT );
    public final void term() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:205:3: ( value | '(' expression ')' | IDENT )
            int alt14=3;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
            case INTEGER:
            case DATE:
            case REAL:
            case BOOLEAN:
            case NULL:
                {
                alt14=1;
                }
                break;
            case 37:
                {
                alt14=2;
                }
                break;
            case IDENT:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:206:3: value
                    {
                    pushFollow(FOLLOW_value_in_term906);
                    value();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:207:5: '(' expression ')'
                    {
                    match(input,37,FOLLOW_37_in_term912); 
                    pushFollow(FOLLOW_expression_in_term914);
                    expression();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_term916); 

                    }
                    break;
                case 3 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:208:5: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_term922); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "term"


    // $ANTLR start "negation"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:211:1: negation : ( 'not' )* term ;
    public final void negation() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:212:3: ( ( 'not' )* term )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:213:3: ( 'not' )* term
            {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:213:3: ( 'not' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==56) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:213:3: 'not'
            	    {
            	    match(input,56,FOLLOW_56_in_negation937); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_negation940);
            term();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "negation"


    // $ANTLR start "unary"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:216:1: unary : ( ADDOP )* negation ;
    public final void unary() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:217:3: ( ( ADDOP )* negation )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:218:3: ( ADDOP )* negation
            {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:218:3: ( ADDOP )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ADDOP) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:218:3: ADDOP
            	    {
            	    match(input,ADDOP,FOLLOW_ADDOP_in_unary955); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            pushFollow(FOLLOW_negation_in_unary958);
            negation();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "unary"


    // $ANTLR start "mult"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:221:1: mult : unary ( MULTOP unary )* ;
    public final void mult() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:222:3: ( unary ( MULTOP unary )* )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:223:3: unary ( MULTOP unary )*
            {
            pushFollow(FOLLOW_unary_in_mult973);
            unary();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:223:9: ( MULTOP unary )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MULTOP) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:223:10: MULTOP unary
            	    {
            	    match(input,MULTOP,FOLLOW_MULTOP_in_mult976); 
            	    pushFollow(FOLLOW_unary_in_mult978);
            	    unary();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mult"


    // $ANTLR start "arith"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:226:1: arith : mult ( ADDOP mult )* ;
    public final void arith() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:227:3: ( mult ( ADDOP mult )* )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:228:3: mult ( ADDOP mult )*
            {
            pushFollow(FOLLOW_mult_in_arith995);
            mult();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:228:8: ( ADDOP mult )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ADDOP) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:228:9: ADDOP mult
            	    {
            	    match(input,ADDOP,FOLLOW_ADDOP_in_arith998); 
            	    pushFollow(FOLLOW_mult_in_arith1000);
            	    mult();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arith"


    // $ANTLR start "relation"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:231:1: relation : arith ( relational_operator arith )* ;
    public final void relation() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:232:3: ( arith ( relational_operator arith )* )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:233:3: arith ( relational_operator arith )*
            {
            pushFollow(FOLLOW_arith_in_relation1017);
            arith();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:233:9: ( relational_operator arith )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUALS||LA19_0==RELOP) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:233:10: relational_operator arith
            	    {
            	    pushFollow(FOLLOW_relational_operator_in_relation1020);
            	    relational_operator();

            	    state._fsp--;

            	    pushFollow(FOLLOW_arith_in_relation1022);
            	    arith();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relation"


    // $ANTLR start "expression"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:236:1: expression : relation ( ( AND | OR ) relation )* ;
    public final void expression() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:237:3: ( relation ( ( AND | OR ) relation )* )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:238:3: relation ( ( AND | OR ) relation )*
            {
            pushFollow(FOLLOW_relation_in_expression1039);
            relation();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:239:3: ( ( AND | OR ) relation )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=AND && LA20_0<=OR)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:240:5: ( AND | OR ) relation
            	    {
            	    if ( (input.LA(1)>=AND && input.LA(1)<=OR) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relation_in_expression1079);
            	    relation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "expression_list"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:248:1: expression_list : expression ( COMMA expression )* ;
    public final void expression_list() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:249:3: ( expression ( COMMA expression )* )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:250:3: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expression_list1099);
            expression();

            state._fsp--;

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:250:14: ( COMMA expression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:250:15: COMMA expression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_expression_list1102); 
            	    pushFollow(FOLLOW_expression_in_expression_list1104);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expression_list"


    // $ANTLR start "relational_operator"
    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:253:1: relational_operator : ( EQUALS | RELOP );
    public final void relational_operator() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:254:3: ( EQUALS | RELOP )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:
            {
            if ( input.LA(1)==EQUALS||input.LA(1)==RELOP ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relational_operator"

    // Delegated rules


 

    public static final BitSet FOLLOW_admin_statement_in_rule55 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EL_in_rule57 = new BitSet(new long[]{0x00F6A982F4000002L});
    public static final BitSet FOLLOW_ddl_statement_in_rule90 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EL_in_rule92 = new BitSet(new long[]{0x00F6A982F4000012L});
    public static final BitSet FOLLOW_dml_statement_in_rule125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EL_in_rule127 = new BitSet(new long[]{0x00F6A982F4000012L});
    public static final BitSet FOLLOW_query_statement_in_rule160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EL_in_rule162 = new BitSet(new long[]{0x00F6A982F4000012L});
    public static final BitSet FOLLOW_exit_in_admin_statement211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_admin_statement217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_admin_statement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_load_in_admin_statement229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_backup_in_admin_statement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_print250 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_print252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_print258 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_print260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_exit275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_read290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_read292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_load307 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_load309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_backup324 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_backup326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_backup328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_define_in_ddl_statement345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rename_in_ddl_statement351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drop_in_ddl_statement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_define_index_in_ddl_statement363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_define378 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_define380 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_define382 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_define384 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_define386 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_define388 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_define390 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TYPE_in_define392 = new BitSet(new long[]{0x0000004000000080L});
    public static final BitSet FOLLOW_COMMA_in_define395 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_define397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TYPE_in_define399 = new BitSet(new long[]{0x0000004000000080L});
    public static final BitSet FOLLOW_38_in_define403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rename418 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_rename420 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_rename422 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_rename424 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_rename426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_drop441 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_drop443 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_drop445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_define_index460 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_define_index462 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_define_index464 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_define_index466 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_define_index468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_define_index470 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_define_index472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_in_dml_statement489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_in_dml_statement495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_in_dml_statement501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_delete516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_delete518 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_delete521 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_expression_in_delete523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_insert540 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_insert542 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_expression_list_in_insert544 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_insert546 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_insert548 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_insert550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_update565 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_table_name_in_update567 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_update569 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_update571 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_in_update573 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_expression_in_update575 = new BitSet(new long[]{0x0000100000000082L});
    public static final BitSet FOLLOW_COMMA_in_update578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_update580 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_in_update582 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_expression_in_update584 = new BitSet(new long[]{0x0000100000000082L});
    public static final BitSet FOLLOW_44_in_update589 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_expression_in_update591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_in_query_statement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_projection_in_query_statement616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_in_query_statement622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intersection_in_query_statement628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_in_query_statement634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_minus_in_query_statement640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_selection655 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_selection657 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_selection660 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_expression_in_selection662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_projection679 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_projection681 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_projection683 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_list_in_projection685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_join700 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_join702 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_AND_in_join704 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_join706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_intersection721 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_intersection723 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_AND_in_intersection725 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_intersection727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_union742 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_union744 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_AND_in_union746 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_union748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_minus763 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_minus765 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_AND_in_minus767 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_query_list_in_minus769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_table_name829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_field_name844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_name_in_field_list859 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_COMMA_in_field_list862 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_field_name_in_field_list864 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_table_name_in_query_list881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_query_list887 = new BitSet(new long[]{0x00F6A9C2F4000000L});
    public static final BitSet FOLLOW_query_statement_in_query_list889 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_query_list891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_term912 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_expression_in_term914 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_term916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_term922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_negation937 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_term_in_negation940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADDOP_in_unary955 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_negation_in_unary958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_mult973 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_MULTOP_in_mult976 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_unary_in_mult978 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_mult_in_arith995 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ADDOP_in_arith998 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_mult_in_arith1000 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_arith_in_relation1017 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_relational_operator_in_relation1020 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_arith_in_relation1022 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_relation_in_expression1039 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_set_in_expression1049 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_relation_in_expression1079 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_expression_in_expression_list1099 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_COMMA_in_expression_list1102 = new BitSet(new long[]{0x010000200000FE20L});
    public static final BitSet FOLLOW_expression_in_expression_list1104 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_relational_operator0 = new BitSet(new long[]{0x0000000000000002L});

}