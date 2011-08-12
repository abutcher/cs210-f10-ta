// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g 2010-09-08 10:23:47

package edu.wvu.mix.abutcher;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CS210_V1Lexer extends Lexer {
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
    public static final int BOOLEAN=12;
    public static final int STRING_LITERAL=5;
    public static final int T__51=51;
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
    public static final int T__33=33;
    public static final int WS=24;
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

    public CS210_V1Lexer() {;} 
    public CS210_V1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CS210_V1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:11:7: ( 'PRINT' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:11:9: 'PRINT'
            {
            match("PRINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:12:7: ( 'DICTIONARY' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:12:9: 'DICTIONARY'
            {
            match("DICTIONARY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:13:7: ( 'EXIT' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:13:9: 'EXIT'
            {
            match("EXIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:14:7: ( 'READ' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:14:9: 'READ'
            {
            match("READ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:15:7: ( 'LOAD' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:15:9: 'LOAD'
            {
            match("LOAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:16:7: ( 'BACKUP' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:16:9: 'BACKUP'
            {
            match("BACKUP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:17:7: ( 'TO' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:17:9: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:18:7: ( 'DEFINE' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:18:9: 'DEFINE'
            {
            match("DEFINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:19:7: ( 'TABLE' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:19:9: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:20:7: ( 'HAVING' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:20:9: 'HAVING'
            {
            match("HAVING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:21:7: ( 'FIELDS' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:21:9: 'FIELDS'
            {
            match("FIELDS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:22:7: ( '(' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:22:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:23:7: ( ')' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:24:7: ( 'RENAME' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:24:9: 'RENAME'
            {
            match("RENAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:25:7: ( 'DROP' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:25:9: 'DROP'
            {
            match("DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:26:7: ( 'INDEX' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:26:9: 'INDEX'
            {
            match("INDEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:27:7: ( 'ON' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:27:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:28:7: ( 'DELETE' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:28:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:29:7: ( 'WHERE' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:29:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:30:7: ( 'INSERT' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:30:9: 'INSERT'
            {
            match("INSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:31:7: ( 'INTO' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:31:9: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:32:7: ( 'UPDATE' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:32:9: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:33:7: ( 'SET' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:33:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:34:7: ( 'SELECT' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:34:9: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:35:7: ( 'PROJECT' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:35:9: 'PROJECT'
            {
            match("PROJECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:36:7: ( 'OVER' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:36:9: 'OVER'
            {
            match("OVER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:37:7: ( 'JOIN' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:37:9: 'JOIN'
            {
            match("JOIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:38:7: ( 'INTERSECT' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:38:9: 'INTERSECT'
            {
            match("INTERSECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:39:7: ( 'UNION' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:39:9: 'UNION'
            {
            match("UNION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:40:7: ( 'MINUS' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:40:9: 'MINUS'
            {
            match("MINUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:41:7: ( 'not' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:41:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:264:3: ( '0' .. '9' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:265:3: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:270:3: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "SPECCHAR"
    public final void mSPECCHAR() throws RecognitionException {
        try {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:277:3: ( '_' | '$' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:
            {
            if ( input.LA(1)=='$'||input.LA(1)=='_' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPECCHAR"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:283:3: ( '.' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:284:3: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERIOD"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:288:3: ( ',' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:289:3: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EL"
    public final void mEL() throws RecognitionException {
        try {
            int _type = EL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:293:3: ( ';' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:294:3: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EL"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:298:3: ( '=' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:299:3: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "RELOP"
    public final void mRELOP() throws RecognitionException {
        try {
            int _type = RELOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:303:3: ( '<=' | '>=' | '<' | '>' | '=' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=1;
                }
                else {
                    alt1=3;}
                }
                break;
            case '>':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='=') ) {
                    alt1=2;
                }
                else {
                    alt1=4;}
                }
                break;
            case '=':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:304:3: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:305:5: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:306:5: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:307:5: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 5 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:308:5: '='
                    {
                    match('='); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELOP"

    // $ANTLR start "ADDOP"
    public final void mADDOP() throws RecognitionException {
        try {
            int _type = ADDOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:312:3: ( '+' | '-' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADDOP"

    // $ANTLR start "MULTOP"
    public final void mMULTOP() throws RecognitionException {
        try {
            int _type = MULTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:318:3: ( '*' | '/' | '\\%' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTOP"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:325:3: ( 'VARCHAR' | 'REAL' | 'INTEGER' | 'DATE' | 'CHAR([0-9]+)' | 'BOOLEAN' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 'V':
                {
                alt2=1;
                }
                break;
            case 'R':
                {
                alt2=2;
                }
                break;
            case 'I':
                {
                alt2=3;
                }
                break;
            case 'D':
                {
                alt2=4;
                }
                break;
            case 'C':
                {
                alt2=5;
                }
                break;
            case 'B':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:326:3: 'VARCHAR'
                    {
                    match("VARCHAR"); 


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:327:5: 'REAL'
                    {
                    match("REAL"); 


                    }
                    break;
                case 3 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:328:5: 'INTEGER'
                    {
                    match("INTEGER"); 


                    }
                    break;
                case 4 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:329:5: 'DATE'
                    {
                    match("DATE"); 


                    }
                    break;
                case 5 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:330:5: 'CHAR([0-9]+)'
                    {
                    match("CHAR([0-9]+)"); 


                    }
                    break;
                case 6 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:331:5: 'BOOLEAN'
                    {
                    match("BOOLEAN"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:335:3: ( 'TRUE' | 'FALSE' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='T') ) {
                alt3=1;
            }
            else if ( (LA3_0=='F') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:336:3: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:337:5: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:341:3: ( 'AND' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:342:3: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:346:3: ( 'OR' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:347:3: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:351:3: ( 'NULL' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:352:3: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:356:3: ( ( DIGIT )+ )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:357:3: ( DIGIT )+
            {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:357:3: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:357:3: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:361:3: ( '\\'' DIGIT DIGIT '/' DIGIT DIGIT '/' DIGIT DIGIT DIGIT DIGIT '\\'' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:362:3: '\\'' DIGIT DIGIT '/' DIGIT DIGIT '/' DIGIT DIGIT DIGIT DIGIT '\\''
            {
            match('\''); 
            mDIGIT(); 
            mDIGIT(); 
            match('/'); 
            mDIGIT(); 
            mDIGIT(); 
            match('/'); 
            mDIGIT(); 
            mDIGIT(); 
            mDIGIT(); 
            mDIGIT(); 
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:366:3: ( '\\'' ( . )* '\\'' )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:367:3: '\\'' ( . )* '\\''
            {
            match('\''); 
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:367:8: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:367:8: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:371:3: ( ( DIGIT )+ ( PERIOD ( DIGIT )* )? )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:372:3: ( DIGIT )+ ( PERIOD ( DIGIT )* )?
            {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:372:3: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:372:3: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:372:10: ( PERIOD ( DIGIT )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='.') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:372:11: PERIOD ( DIGIT )*
                    {
                    mPERIOD(); 
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:372:18: ( DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:372:19: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:376:3: ( ( SPECCHAR )? LETTER ( LETTER | DIGIT | SPECCHAR )* )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:377:3: ( SPECCHAR )? LETTER ( LETTER | DIGIT | SPECCHAR )*
            {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:377:3: ( SPECCHAR )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='$'||LA9_0=='_') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:377:4: SPECCHAR
                    {
                    mSPECCHAR(); 

                    }
                    break;

            }

            mLETTER(); 
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:378:3: ( LETTER | DIGIT | SPECCHAR )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='$'||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:386:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:387:3: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:387:3: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||(LA11_0>='\f' && LA11_0<='\r')||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


               _channel = HIDDEN;
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:401:3: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:402:3: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:402:8: ( . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                    alt12=2;
                }
                else if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:402:8: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


               _channel = HIDDEN;
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | PERIOD | COMMA | EL | EQUALS | RELOP | ADDOP | MULTOP | TYPE | BOOLEAN | AND | OR | NULL | INTEGER | DATE | STRING_LITERAL | REAL | IDENT | WS | COMMENT )
        int alt13=50;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:22: T__28
                {
                mT__28(); 

                }
                break;
            case 4 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:28: T__29
                {
                mT__29(); 

                }
                break;
            case 5 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:34: T__30
                {
                mT__30(); 

                }
                break;
            case 6 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:40: T__31
                {
                mT__31(); 

                }
                break;
            case 7 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:46: T__32
                {
                mT__32(); 

                }
                break;
            case 8 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:52: T__33
                {
                mT__33(); 

                }
                break;
            case 9 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:58: T__34
                {
                mT__34(); 

                }
                break;
            case 10 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:64: T__35
                {
                mT__35(); 

                }
                break;
            case 11 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:70: T__36
                {
                mT__36(); 

                }
                break;
            case 12 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:76: T__37
                {
                mT__37(); 

                }
                break;
            case 13 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:82: T__38
                {
                mT__38(); 

                }
                break;
            case 14 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:88: T__39
                {
                mT__39(); 

                }
                break;
            case 15 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:94: T__40
                {
                mT__40(); 

                }
                break;
            case 16 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:100: T__41
                {
                mT__41(); 

                }
                break;
            case 17 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:106: T__42
                {
                mT__42(); 

                }
                break;
            case 18 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:112: T__43
                {
                mT__43(); 

                }
                break;
            case 19 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:118: T__44
                {
                mT__44(); 

                }
                break;
            case 20 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:124: T__45
                {
                mT__45(); 

                }
                break;
            case 21 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:130: T__46
                {
                mT__46(); 

                }
                break;
            case 22 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:136: T__47
                {
                mT__47(); 

                }
                break;
            case 23 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:142: T__48
                {
                mT__48(); 

                }
                break;
            case 24 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:148: T__49
                {
                mT__49(); 

                }
                break;
            case 25 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:154: T__50
                {
                mT__50(); 

                }
                break;
            case 26 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:160: T__51
                {
                mT__51(); 

                }
                break;
            case 27 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:166: T__52
                {
                mT__52(); 

                }
                break;
            case 28 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:172: T__53
                {
                mT__53(); 

                }
                break;
            case 29 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:178: T__54
                {
                mT__54(); 

                }
                break;
            case 30 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:184: T__55
                {
                mT__55(); 

                }
                break;
            case 31 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:190: T__56
                {
                mT__56(); 

                }
                break;
            case 32 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:196: PERIOD
                {
                mPERIOD(); 

                }
                break;
            case 33 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:203: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 34 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:209: EL
                {
                mEL(); 

                }
                break;
            case 35 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:212: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 36 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:219: RELOP
                {
                mRELOP(); 

                }
                break;
            case 37 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:225: ADDOP
                {
                mADDOP(); 

                }
                break;
            case 38 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:231: MULTOP
                {
                mMULTOP(); 

                }
                break;
            case 39 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:238: TYPE
                {
                mTYPE(); 

                }
                break;
            case 40 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:243: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 41 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:251: AND
                {
                mAND(); 

                }
                break;
            case 42 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:255: OR
                {
                mOR(); 

                }
                break;
            case 43 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:258: NULL
                {
                mNULL(); 

                }
                break;
            case 44 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:263: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 45 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:271: DATE
                {
                mDATE(); 

                }
                break;
            case 46 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:276: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 47 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:291: REAL
                {
                mREAL(); 

                }
                break;
            case 48 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:296: IDENT
                {
                mIDENT(); 

                }
                break;
            case 49 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:302: WS
                {
                mWS(); 

                }
                break;
            case 50 :
                // /Users/abutcher/Documents/workspace/abutcher-p1/src/edu/wvu/mix/abutcher/CS210_V1.g:1:305: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\11\41\2\uffff\10\41\6\uffff\1\43\4\41\1\105\4\uffff\12"+
        "\41\1\126\6\41\1\137\1\41\1\141\7\41\2\uffff\4\41\4\uffff\15\41"+
        "\1\uffff\10\41\1\uffff\1\41\1\uffff\3\41\1\u008a\3\41\1\u008e\2"+
        "\41\1\u0091\1\41\1\uffff\5\41\1\u0099\1\u009a\1\u009b\1\u009c\1"+
        "\u009a\1\41\1\u009e\3\41\1\u00a2\5\41\1\u00a8\1\41\1\u00ab\3\41"+
        "\1\uffff\1\41\1\u00b0\1\41\1\uffff\2\41\1\uffff\1\u00b3\1\uffff"+
        "\1\u00b5\4\41\4\uffff\1\41\1\uffff\2\41\1\u00bd\1\uffff\2\41\1\u00a2"+
        "\1\u00c0\1\41\1\uffff\2\41\1\uffff\1\u00c4\1\41\1\u00c6\1\41\1\uffff"+
        "\1\u00c8\1\41\3\uffff\2\41\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\41"+
        "\1\uffff\1\u00d2\1\u00d3\1\uffff\1\u00d4\2\41\1\uffff\1\u00d7\1"+
        "\uffff\1\u00d8\1\uffff\1\41\1\uffff\1\u00db\1\41\4\uffff\1\u009a"+
        "\3\uffff\1\41\1\u009a\2\uffff\1\u009a\2\uffff\2\41\1\uffff\1\41"+
        "\1\u00e3\1\uffff\1\u00e5\4\uffff\1\u00e8\1\uffff";
    static final String DFA13_eofS =
        "\u00e9\uffff";
    static final String DFA13_minS =
        "\1\11\1\122\1\101\1\130\1\105\1\117\4\101\2\uffff\2\116\1\110\1"+
        "\116\1\105\1\117\1\111\1\157\6\uffff\1\57\1\101\1\110\1\116\1\125"+
        "\1\56\1\0\3\uffff\1\111\1\103\1\106\1\117\1\124\1\111\2\101\1\103"+
        "\1\117\1\44\1\102\1\125\1\126\1\105\1\114\1\104\1\44\1\105\1\44"+
        "\1\105\1\104\1\111\1\114\1\111\1\116\1\164\2\uffff\1\122\1\101\1"+
        "\104\1\114\2\uffff\1\0\1\uffff\1\116\1\112\1\124\1\111\1\105\1\120"+
        "\1\105\1\124\1\104\1\101\1\104\1\113\1\114\1\uffff\1\114\1\105\1"+
        "\111\1\114\1\123\3\105\1\uffff\1\122\1\uffff\1\122\1\101\1\117\1"+
        "\44\1\105\1\116\1\125\1\44\1\103\1\122\1\44\1\114\1\0\1\124\1\105"+
        "\1\111\1\116\1\124\5\44\1\115\1\44\1\125\2\105\1\44\1\116\1\104"+
        "\1\105\1\130\1\122\1\44\1\107\1\44\1\105\1\124\1\116\1\uffff\1\103"+
        "\1\44\1\123\1\uffff\1\110\1\50\1\uffff\1\44\1\0\1\44\1\103\1\117"+
        "\2\105\4\uffff\1\105\1\uffff\1\120\1\101\1\44\1\uffff\1\107\1\123"+
        "\2\44\1\124\1\uffff\1\123\1\105\1\uffff\1\44\1\105\1\44\1\124\1"+
        "\uffff\1\44\1\101\1\uffff\1\0\1\uffff\1\124\1\116\4\44\1\116\1\uffff"+
        "\2\44\1\uffff\1\44\1\105\1\122\1\uffff\1\44\1\uffff\1\44\1\uffff"+
        "\1\122\1\0\1\44\1\101\4\uffff\1\44\3\uffff\1\103\1\44\2\uffff\1"+
        "\44\1\0\1\uffff\1\122\1\124\1\0\1\131\1\44\1\0\1\44\1\uffff\1\0"+
        "\1\uffff\2\0\1\uffff";
    static final String DFA13_maxS =
        "\1\172\2\122\1\130\1\105\2\117\1\122\1\101\1\111\2\uffff\1\116\1"+
        "\126\1\110\1\120\1\105\1\117\1\111\1\157\6\uffff\1\57\1\101\1\110"+
        "\1\116\1\125\1\71\1\uffff\3\uffff\1\117\1\103\1\114\1\117\1\124"+
        "\1\111\1\116\1\101\1\103\1\117\1\172\1\102\1\125\1\126\1\105\1\114"+
        "\1\124\1\172\1\105\1\172\1\105\1\104\1\111\1\124\1\111\1\116\1\164"+
        "\2\uffff\1\122\1\101\1\104\1\114\2\uffff\1\uffff\1\uffff\1\116\1"+
        "\112\1\124\1\111\1\105\1\120\1\105\1\124\1\114\1\101\1\104\1\113"+
        "\1\114\1\uffff\1\114\1\105\1\111\1\114\1\123\2\105\1\117\1\uffff"+
        "\1\122\1\uffff\1\122\1\101\1\117\1\172\1\105\1\116\1\125\1\172\1"+
        "\103\1\122\1\172\1\114\1\uffff\1\124\1\105\1\111\1\116\1\124\5\172"+
        "\1\115\1\172\1\125\2\105\1\172\1\116\1\104\1\105\1\130\1\122\1\172"+
        "\1\122\1\172\1\105\1\124\1\116\1\uffff\1\103\1\172\1\123\1\uffff"+
        "\1\110\1\50\1\uffff\1\172\1\uffff\1\172\1\103\1\117\2\105\4\uffff"+
        "\1\105\1\uffff\1\120\1\101\1\172\1\uffff\1\107\1\123\2\172\1\124"+
        "\1\uffff\1\123\1\105\1\uffff\1\172\1\105\1\172\1\124\1\uffff\1\172"+
        "\1\101\1\uffff\1\uffff\1\uffff\1\124\1\116\4\172\1\116\1\uffff\2"+
        "\172\1\uffff\1\172\1\105\1\122\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\122\1\uffff\1\172\1\101\4\uffff\1\172\3\uffff\1\103\1\172\2\uffff"+
        "\1\172\1\uffff\1\uffff\1\122\1\124\1\uffff\1\131\1\172\1\uffff\1"+
        "\172\1\uffff\1\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA13_acceptS =
        "\12\uffff\1\14\1\15\10\uffff\1\40\1\41\1\42\1\43\1\44\1\45\7\uffff"+
        "\1\60\1\61\1\46\33\uffff\1\43\1\62\4\uffff\1\54\1\57\1\uffff\1\56"+
        "\15\uffff\1\7\10\uffff\1\21\1\uffff\1\52\50\uffff\1\27\3\uffff\1"+
        "\37\2\uffff\1\51\7\uffff\1\17\1\47\1\3\1\4\1\uffff\1\5\3\uffff\1"+
        "\50\5\uffff\1\25\2\uffff\1\32\4\uffff\1\33\2\uffff\1\53\1\uffff"+
        "\1\1\7\uffff\1\11\2\uffff\1\20\3\uffff\1\23\1\uffff\1\35\1\uffff"+
        "\1\36\4\uffff\1\10\1\22\1\16\1\6\1\uffff\1\12\1\13\1\24\2\uffff"+
        "\1\26\1\30\2\uffff\1\31\7\uffff\1\34\1\uffff\1\2\2\uffff\1\55";
    static final String DFA13_specialS =
        "\40\uffff\1\0\46\uffff\1\13\46\uffff\1\2\44\uffff\1\5\40\uffff\1"+
        "\11\25\uffff\1\1\17\uffff\1\6\3\uffff\1\12\2\uffff\1\7\2\uffff\1"+
        "\10\1\uffff\1\4\1\3\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\42\1\uffff\2\42\22\uffff\1\42\3\uffff\1\41\1\43\1\uffff\1"+
            "\40\1\12\1\13\1\43\1\31\1\25\1\31\1\24\1\32\12\37\1\uffff\1"+
            "\26\1\30\1\27\1\30\2\uffff\1\35\1\6\1\34\1\2\1\3\1\11\1\41\1"+
            "\10\1\14\1\21\1\41\1\5\1\22\1\36\1\15\1\1\1\41\1\4\1\20\1\7"+
            "\1\17\1\33\1\16\3\41\4\uffff\1\41\1\uffff\15\41\1\23\14\41",
            "\1\44",
            "\1\50\3\uffff\1\46\3\uffff\1\45\10\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\15\uffff\1\55",
            "\1\57\15\uffff\1\56\2\uffff\1\60",
            "\1\61",
            "\1\63\7\uffff\1\62",
            "",
            "",
            "\1\64",
            "\1\65\3\uffff\1\67\3\uffff\1\66",
            "\1\70",
            "\1\72\1\uffff\1\71",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\1\uffff\12\37",
            "\60\110\12\107\uffc6\110",
            "",
            "",
            "",
            "\1\111\5\uffff\1\112",
            "\1\113",
            "\1\114\5\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121\14\uffff\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134\16\uffff\1\135\1\136",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\140",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\146\7\uffff\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\60\110\12\156\uffc6\110",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167\7\uffff\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0085\11\uffff\1\u0084",
            "",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u008f",
            "\1\u0090",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u0092",
            "\57\110\1\u0093\uffd0\110",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u009d",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00aa\12\uffff\1\u00a9",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u009a",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\60\110\12\u00b4\uffc6\110",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "",
            "",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00c5",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00c7",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00c9",
            "",
            "\60\110\12\u00ca\uffc6\110",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00d1",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\1\u00d9",
            "\57\110\1\u00da\uffd0\110",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\1\u00dc",
            "",
            "",
            "",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "",
            "",
            "\1\u00dd",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\60\110\12\u00de\uffc6\110",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\60\110\12\u00e1\uffc6\110",
            "\1\u00e2",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "\60\110\12\u00e4\uffc6\110",
            "\1\41\13\uffff\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32"+
            "\41",
            "",
            "\60\110\12\u00e6\uffc6\110",
            "",
            "\47\110\1\u00e7\uffd8\110",
            "\0\110",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | PERIOD | COMMA | EL | EQUALS | RELOP | ADDOP | MULTOP | TYPE | BOOLEAN | AND | OR | NULL | INTEGER | DATE | STRING_LITERAL | REAL | IDENT | WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( ((LA13_32>='0' && LA13_32<='9')) ) {s = 71;}

                        else if ( ((LA13_32>='\u0000' && LA13_32<='/')||(LA13_32>=':' && LA13_32<='\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_202 = input.LA(1);

                        s = -1;
                        if ( (LA13_202=='/') ) {s = 218;}

                        else if ( ((LA13_202>='\u0000' && LA13_202<='.')||(LA13_202>='0' && LA13_202<='\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_110 = input.LA(1);

                        s = -1;
                        if ( ((LA13_110>='\u0000' && LA13_110<='.')||(LA13_110>='0' && LA13_110<='\uFFFF')) ) {s = 72;}

                        else if ( (LA13_110=='/') ) {s = 147;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_231 = input.LA(1);

                        s = -1;
                        if ( ((LA13_231>='\u0000' && LA13_231<='\uFFFF')) ) {s = 72;}

                        else s = 232;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_230 = input.LA(1);

                        s = -1;
                        if ( (LA13_230=='\'') ) {s = 231;}

                        else if ( ((LA13_230>='\u0000' && LA13_230<='&')||(LA13_230>='(' && LA13_230<='\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_147 = input.LA(1);

                        s = -1;
                        if ( ((LA13_147>='\u0000' && LA13_147<='/')||(LA13_147>=':' && LA13_147<='\uFFFF')) ) {s = 72;}

                        else if ( ((LA13_147>='0' && LA13_147<='9')) ) {s = 180;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_218 = input.LA(1);

                        s = -1;
                        if ( ((LA13_218>='\u0000' && LA13_218<='/')||(LA13_218>=':' && LA13_218<='\uFFFF')) ) {s = 72;}

                        else if ( ((LA13_218>='0' && LA13_218<='9')) ) {s = 222;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_225 = input.LA(1);

                        s = -1;
                        if ( ((LA13_225>='\u0000' && LA13_225<='/')||(LA13_225>=':' && LA13_225<='\uFFFF')) ) {s = 72;}

                        else if ( ((LA13_225>='0' && LA13_225<='9')) ) {s = 228;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_228 = input.LA(1);

                        s = -1;
                        if ( ((LA13_228>='\u0000' && LA13_228<='/')||(LA13_228>=':' && LA13_228<='\uFFFF')) ) {s = 72;}

                        else if ( ((LA13_228>='0' && LA13_228<='9')) ) {s = 230;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_180 = input.LA(1);

                        s = -1;
                        if ( ((LA13_180>='0' && LA13_180<='9')) ) {s = 202;}

                        else if ( ((LA13_180>='\u0000' && LA13_180<='/')||(LA13_180>=':' && LA13_180<='\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_222 = input.LA(1);

                        s = -1;
                        if ( ((LA13_222>='0' && LA13_222<='9')) ) {s = 225;}

                        else if ( ((LA13_222>='\u0000' && LA13_222<='/')||(LA13_222>=':' && LA13_222<='\uFFFF')) ) {s = 72;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_71 = input.LA(1);

                        s = -1;
                        if ( ((LA13_71>='\u0000' && LA13_71<='/')||(LA13_71>=':' && LA13_71<='\uFFFF')) ) {s = 72;}

                        else if ( ((LA13_71>='0' && LA13_71<='9')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}