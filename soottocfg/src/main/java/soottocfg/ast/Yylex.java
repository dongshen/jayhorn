/* The following code was generated by JFlex 1.6.1 */

// This JLex file was machine-generated by the BNF converter
package soottocfg.ast;

import java_cup.runtime.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>soottocfg/ast/Yylex</tt>
 */
public class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int CHAR = 4;
  public static final int CHARESC = 6;
  public static final int CHAREND = 8;
  public static final int STRING = 10;
  public static final int ESCAPED = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  2,  2,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\63\1\56\1\60\1\57\1\57\22\0\1\63\1\22\1\61"+
    "\2\0\1\27\1\20\1\3\1\13\1\14\1\25\1\23\1\11\1\24"+
    "\1\30\1\26\12\2\1\10\1\12\1\6\1\15\1\7\1\16\1\0"+
    "\32\1\1\0\1\62\1\0\1\21\1\3\1\0\1\32\1\41\1\45"+
    "\1\46\1\34\1\47\1\51\1\52\1\50\2\1\1\43\1\40\1\44"+
    "\1\42\1\54\1\1\1\35\1\33\1\36\1\37\1\53\1\55\3\1"+
    "\1\4\1\17\1\5\1\31\6\0\1\60\72\0\27\1\1\0\7\1"+
    "\30\1\1\0\10\1\u1f28\0\1\60\1\60\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\20\1\1\31\1\32\2\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\0\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\0"+
    "\11\1\1\55\5\1\1\56\5\1\1\0\1\57\1\60"+
    "\1\61\1\54\1\62\6\1\1\63\10\1\1\64\6\1"+
    "\1\0\2\1\1\65\1\1\1\66\1\1\1\67\1\70"+
    "\7\1\1\71\1\1\1\72\1\73\1\74\1\1\1\60"+
    "\1\0\4\1\1\75\1\1\1\76\1\77\1\100\2\1"+
    "\1\101\1\102\1\103\1\104\1\105\1\1\1\106\2\1"+
    "\1\107\6\1\1\110\1\111";

  private static int [] zzUnpackAction() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\150"+
    "\0\150\0\u016c\0\u01a0\0\150\0\150\0\150\0\150\0\150"+
    "\0\u01d4\0\150\0\u0208\0\u023c\0\150\0\u0270\0\150\0\150"+
    "\0\150\0\u02a4\0\150\0\150\0\150\0\u02d8\0\u030c\0\u0340"+
    "\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac\0\u04e0"+
    "\0\u0514\0\u0548\0\u057c\0\u05b0\0\u05e4\0\150\0\150\0\150"+
    "\0\u0618\0\150\0\150\0\150\0\150\0\150\0\150\0\150"+
    "\0\150\0\u064c\0\150\0\150\0\u0680\0\150\0\150\0\150"+
    "\0\150\0\150\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0784\0\u07b8"+
    "\0\u07ec\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958"+
    "\0\u098c\0\u09c0\0\u09f4\0\u0104\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4"+
    "\0\u0af8\0\u0b2c\0\150\0\u0b60\0\150\0\150\0\150\0\u0b94"+
    "\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0104\0\u0ccc\0\u0d00"+
    "\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38\0\u0104\0\u0e6c"+
    "\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8\0\u100c"+
    "\0\u0104\0\u1040\0\u0104\0\u1074\0\u0104\0\u0104\0\u10a8\0\u10dc"+
    "\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u0104\0\u1214\0\u0104"+
    "\0\u0104\0\u0104\0\u1248\0\u127c\0\u127c\0\u12b0\0\u12e4\0\u1318"+
    "\0\u134c\0\u0104\0\u1380\0\u0104\0\u0104\0\u0104\0\u13b4\0\u13e8"+
    "\0\u0104\0\u0104\0\u0104\0\u0104\0\u0104\0\u141c\0\u0104\0\u1450"+
    "\0\u1484\0\u0104\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588\0\u15bc"+
    "\0\u0104\0\u0104";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\6\1\7\1\0\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\6\1\37\1\40\1\41\2\6"+
    "\1\42\1\6\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\2\56\1\0\1\57"+
    "\1\0\1\56\25\60\1\61\31\60\2\0\3\60\64\0"+
    "\56\62\3\0\1\63\1\64\1\62\36\65\1\66\5\65"+
    "\1\67\11\65\3\0\1\70\1\71\1\65\1\0\3\6"+
    "\26\0\24\6\10\0\1\7\25\0\1\72\41\0\1\73"+
    "\6\0\1\74\55\0\1\75\5\0\1\76\63\0\1\77"+
    "\65\0\1\100\64\0\1\101\60\0\1\102\73\0\1\103"+
    "\1\104\36\0\3\6\26\0\1\6\1\105\22\6\7\0"+
    "\3\6\26\0\11\6\1\106\12\6\7\0\3\6\26\0"+
    "\2\6\1\107\21\6\7\0\3\6\26\0\3\6\1\110"+
    "\20\6\7\0\3\6\26\0\10\6\1\111\13\6\7\0"+
    "\3\6\26\0\10\6\1\112\13\6\7\0\3\6\26\0"+
    "\2\6\1\113\2\6\1\114\16\6\7\0\3\6\26\0"+
    "\11\6\1\115\12\6\7\0\3\6\26\0\10\6\1\116"+
    "\13\6\7\0\3\6\26\0\1\117\10\6\1\120\4\6"+
    "\1\121\5\6\7\0\3\6\26\0\6\6\1\122\3\6"+
    "\1\123\2\6\1\124\6\6\7\0\3\6\26\0\10\6"+
    "\1\125\13\6\7\0\3\6\26\0\1\126\23\6\7\0"+
    "\3\6\26\0\10\6\1\127\13\6\7\0\3\6\26\0"+
    "\5\6\1\130\16\6\7\0\3\6\26\0\20\6\1\131"+
    "\3\6\33\0\1\132\1\133\37\0\1\134\70\0\1\135"+
    "\101\0\1\136\36\0\56\104\1\137\5\104\1\0\3\6"+
    "\26\0\1\6\1\140\22\6\7\0\3\6\26\0\1\6"+
    "\1\141\22\6\7\0\3\6\26\0\4\6\1\142\17\6"+
    "\7\0\3\6\26\0\5\6\1\143\16\6\7\0\3\6"+
    "\26\0\10\6\1\144\13\6\7\0\3\6\26\0\12\6"+
    "\1\145\11\6\7\0\3\6\26\0\23\6\1\146\7\0"+
    "\3\6\26\0\11\6\1\147\12\6\7\0\3\6\26\0"+
    "\1\150\23\6\7\0\3\6\26\0\5\6\1\151\16\6"+
    "\7\0\3\6\26\0\11\6\1\152\12\6\7\0\3\6"+
    "\26\0\10\6\1\153\13\6\7\0\3\6\26\0\12\6"+
    "\1\154\11\6\7\0\3\6\26\0\22\6\1\155\1\6"+
    "\7\0\3\6\26\0\1\6\1\156\2\6\1\157\17\6"+
    "\7\0\3\6\26\0\4\6\1\160\17\6\7\0\3\6"+
    "\26\0\21\6\1\161\2\6\7\0\3\6\26\0\16\6"+
    "\1\162\5\6\7\0\3\6\26\0\1\6\1\163\7\6"+
    "\1\164\12\6\7\0\3\6\26\0\16\6\1\165\5\6"+
    "\34\0\1\133\37\0\1\134\31\0\1\166\30\0\3\6"+
    "\26\0\2\6\1\167\2\6\1\170\16\6\7\0\3\6"+
    "\26\0\2\6\1\171\21\6\7\0\3\6\26\0\5\6"+
    "\1\172\16\6\7\0\3\6\26\0\2\6\1\173\21\6"+
    "\7\0\3\6\26\0\11\6\1\174\12\6\7\0\3\6"+
    "\26\0\17\6\1\175\4\6\7\0\3\6\26\0\11\6"+
    "\1\176\12\6\7\0\3\6\26\0\1\6\1\177\22\6"+
    "\7\0\3\6\26\0\7\6\1\200\14\6\7\0\3\6"+
    "\26\0\1\6\1\201\22\6\7\0\3\6\26\0\1\202"+
    "\23\6\7\0\3\6\26\0\1\203\23\6\7\0\3\6"+
    "\26\0\11\6\1\204\12\6\7\0\3\6\26\0\4\6"+
    "\1\205\17\6\7\0\3\6\26\0\10\6\1\206\13\6"+
    "\7\0\3\6\26\0\10\6\1\207\13\6\7\0\3\6"+
    "\26\0\14\6\1\210\7\6\7\0\3\6\26\0\20\6"+
    "\1\211\3\6\7\0\3\6\26\0\11\6\1\212\12\6"+
    "\7\0\3\6\26\0\11\6\1\213\12\6\10\0\1\214"+
    "\21\0\1\215\40\0\3\6\26\0\3\6\1\216\20\6"+
    "\7\0\3\6\26\0\6\6\1\217\15\6\7\0\3\6"+
    "\26\0\3\6\1\220\20\6\7\0\3\6\26\0\2\6"+
    "\1\221\21\6\7\0\3\6\26\0\1\6\1\222\22\6"+
    "\7\0\3\6\26\0\11\6\1\223\12\6\7\0\3\6"+
    "\26\0\2\6\1\224\21\6\7\0\3\6\26\0\4\6"+
    "\1\225\17\6\7\0\3\6\26\0\11\6\1\226\12\6"+
    "\7\0\3\6\26\0\2\6\1\227\21\6\7\0\3\6"+
    "\26\0\1\230\23\6\7\0\3\6\26\0\13\6\1\231"+
    "\10\6\7\0\3\6\26\0\2\6\1\232\21\6\10\0"+
    "\1\214\62\0\3\6\26\0\4\6\1\233\17\6\7\0"+
    "\3\6\26\0\2\6\1\234\21\6\7\0\3\6\26\0"+
    "\12\6\1\235\11\6\7\0\3\6\26\0\1\236\23\6"+
    "\7\0\3\6\26\0\2\6\1\237\21\6\7\0\3\6"+
    "\26\0\6\6\1\240\15\6\7\0\3\6\26\0\12\6"+
    "\1\241\11\6\7\0\3\6\26\0\12\6\1\242\11\6"+
    "\7\0\3\6\26\0\2\6\1\243\21\6\7\0\3\6"+
    "\26\0\13\6\1\244\10\6\7\0\3\6\26\0\12\6"+
    "\1\245\11\6\7\0\3\6\26\0\2\6\1\246\21\6"+
    "\7\0\3\6\26\0\4\6\1\247\17\6\7\0\3\6"+
    "\26\0\10\6\1\250\13\6\7\0\3\6\26\0\1\6"+
    "\1\251\22\6\7\0\3\6\26\0\15\6\1\252\6\6"+
    "\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5616];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\10\2\0\2\1\2\11\2\1\5\11\1\1"+
    "\1\11\2\1\1\11\1\1\3\11\1\1\3\11\20\1"+
    "\3\11\1\1\10\11\1\0\2\11\1\1\5\11\1\1"+
    "\1\0\25\1\1\0\1\11\1\1\3\11\26\1\1\0"+
    "\26\1\1\0\35\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  String pstring = new String();
  public int line_num() { return (yyline+1); }
  public String buff() {return new String(zzBuffer,zzCurrentPos,10).trim();}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 186) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return new Symbol(sym._IDENT_, yytext().intern());
            }
          case 74: break;
          case 2: 
            { return new Symbol(sym._INTEGER_, new Integer(yytext()));
            }
          case 75: break;
          case 3: 
            { return new Symbol(sym._SYMB_0);
            }
          case 76: break;
          case 4: 
            { return new Symbol(sym._SYMB_1);
            }
          case 77: break;
          case 5: 
            { return new Symbol(sym._SYMB_2);
            }
          case 78: break;
          case 6: 
            { return new Symbol(sym._SYMB_3);
            }
          case 79: break;
          case 7: 
            { return new Symbol(sym._SYMB_4);
            }
          case 80: break;
          case 8: 
            { return new Symbol(sym._SYMB_5);
            }
          case 81: break;
          case 9: 
            { return new Symbol(sym._SYMB_6);
            }
          case 82: break;
          case 10: 
            { return new Symbol(sym._SYMB_7);
            }
          case 83: break;
          case 11: 
            { return new Symbol(sym._SYMB_8);
            }
          case 84: break;
          case 12: 
            { return new Symbol(sym._SYMB_9);
            }
          case 85: break;
          case 13: 
            { return new Symbol(sym._SYMB_10);
            }
          case 86: break;
          case 14: 
            { return new Symbol(sym._SYMB_13);
            }
          case 87: break;
          case 15: 
            { return new Symbol(sym._SYMB_15);
            }
          case 88: break;
          case 16: 
            { return new Symbol(sym._SYMB_14);
            }
          case 89: break;
          case 17: 
            { return new Symbol(sym._SYMB_30);
            }
          case 90: break;
          case 18: 
            { return new Symbol(sym._SYMB_23);
            }
          case 91: break;
          case 19: 
            { return new Symbol(sym._SYMB_24);
            }
          case 92: break;
          case 20: 
            { return new Symbol(sym._SYMB_25);
            }
          case 93: break;
          case 21: 
            { return new Symbol(sym._SYMB_26);
            }
          case 94: break;
          case 22: 
            { return new Symbol(sym._SYMB_27);
            }
          case 95: break;
          case 23: 
            { return new Symbol(sym._SYMB_28);
            }
          case 96: break;
          case 24: 
            { return new Symbol(sym._SYMB_29);
            }
          case 97: break;
          case 25: 
            { /* ignore white space. */
            }
          case 98: break;
          case 26: 
            { yybegin(STRING);
            }
          case 99: break;
          case 27: 
            { 
            }
          case 100: break;
          case 28: 
            { pstring += yytext();
            }
          case 101: break;
          case 29: 
            { String foo = pstring; pstring = new String(); yybegin(YYINITIAL); return new Symbol(sym._STRING_, foo.intern());
            }
          case 102: break;
          case 30: 
            { yybegin(ESCAPED);
            }
          case 103: break;
          case 31: 
            { pstring += yytext(); yybegin(STRING);
            }
          case 104: break;
          case 32: 
            { pstring += "\t"; yybegin(STRING);
            }
          case 105: break;
          case 33: 
            { pstring +=  "\n"; yybegin(STRING);
            }
          case 106: break;
          case 34: 
            { pstring += "\""; yybegin(STRING);
            }
          case 107: break;
          case 35: 
            { pstring += "\\"; yybegin(STRING);
            }
          case 108: break;
          case 36: 
            { return new Symbol(sym._SYMB_20);
            }
          case 109: break;
          case 37: 
            { return new Symbol(sym._SYMB_18);
            }
          case 110: break;
          case 38: 
            { return new Symbol(sym._SYMB_21);
            }
          case 111: break;
          case 39: 
            { return new Symbol(sym._SYMB_19);
            }
          case 112: break;
          case 40: 
            { return new Symbol(sym._SYMB_16);
            }
          case 113: break;
          case 41: 
            { return new Symbol(sym._SYMB_11);
            }
          case 114: break;
          case 42: 
            { return new Symbol(sym._SYMB_12);
            }
          case 115: break;
          case 43: 
            { return new Symbol(sym._SYMB_17);
            }
          case 116: break;
          case 44: 
            { yybegin(COMMENT);
            }
          case 117: break;
          case 45: 
            { return new Symbol(sym._SYMB_35);
            }
          case 118: break;
          case 46: 
            { return new Symbol(sym._SYMB_43);
            }
          case 119: break;
          case 47: 
            { yybegin(YYINITIAL);
            }
          case 120: break;
          case 48: 
            { return new Symbol(sym._DOUBLE_, new Double(yytext()));
            }
          case 121: break;
          case 49: 
            { return new Symbol(sym._SYMB_22);
            }
          case 122: break;
          case 50: 
            { /* BNFC single-line comment */
            }
          case 123: break;
          case 51: 
            { return new Symbol(sym._SYMB_48);
            }
          case 124: break;
          case 52: 
            { return new Symbol(sym._SYMB_46);
            }
          case 125: break;
          case 53: 
            { return new Symbol(sym._SYMB_37);
            }
          case 126: break;
          case 54: 
            { return new Symbol(sym._SYMB_53);
            }
          case 127: break;
          case 55: 
            { return new Symbol(sym._SYMB_47);
            }
          case 128: break;
          case 56: 
            { return new Symbol(sym._SYMB_49);
            }
          case 129: break;
          case 57: 
            { return new Symbol(sym._SYMB_41);
            }
          case 130: break;
          case 58: 
            { return new Symbol(sym._SYMB_54);
            }
          case 131: break;
          case 59: 
            { return new Symbol(sym._SYMB_51);
            }
          case 132: break;
          case 60: 
            { return new Symbol(sym._SYMB_50);
            }
          case 133: break;
          case 61: 
            { return new Symbol(sym._SYMB_34);
            }
          case 134: break;
          case 62: 
            { return new Symbol(sym._SYMB_38);
            }
          case 135: break;
          case 63: 
            { return new Symbol(sym._SYMB_40);
            }
          case 136: break;
          case 64: 
            { return new Symbol(sym._SYMB_39);
            }
          case 137: break;
          case 65: 
            { return new Symbol(sym._SYMB_42);
            }
          case 138: break;
          case 66: 
            { return new Symbol(sym._SYMB_55);
            }
          case 139: break;
          case 67: 
            { return new Symbol(sym._SYMB_31);
            }
          case 140: break;
          case 68: 
            { return new Symbol(sym._SYMB_32);
            }
          case 141: break;
          case 69: 
            { return new Symbol(sym._SYMB_52);
            }
          case 142: break;
          case 70: 
            { return new Symbol(sym._SYMB_36);
            }
          case 143: break;
          case 71: 
            { return new Symbol(sym._SYMB_33);
            }
          case 144: break;
          case 72: 
            { return new Symbol(sym._SYMB_44);
            }
          case 145: break;
          case 73: 
            { return new Symbol(sym._SYMB_45);
            }
          case 146: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}