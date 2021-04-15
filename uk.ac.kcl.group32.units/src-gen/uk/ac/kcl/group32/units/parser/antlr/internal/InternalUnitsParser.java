package uk.ac.kcl.group32.units.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.group32.units.services.UnitsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnitsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'let'", "'='", "'convert'", "'('", "')'", "'to'", "'.'", "'kg'", "'g'", "'hr'", "'m'", "'s'", "'km'", "'cm'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUnitsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnitsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUnitsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUnits.g"; }



     	private UnitsGrammarAccess grammarAccess;

        public InternalUnitsParser(TokenStream input, UnitsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Units";
       	}

       	@Override
       	protected UnitsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUnits"
    // InternalUnits.g:65:1: entryRuleUnits returns [EObject current=null] : iv_ruleUnits= ruleUnits EOF ;
    public final EObject entryRuleUnits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnits = null;


        try {
            // InternalUnits.g:65:46: (iv_ruleUnits= ruleUnits EOF )
            // InternalUnits.g:66:2: iv_ruleUnits= ruleUnits EOF
            {
             newCompositeNode(grammarAccess.getUnitsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnits=ruleUnits();

            state._fsp--;

             current =iv_ruleUnits; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnits"


    // $ANTLR start "ruleUnits"
    // InternalUnits.g:72:1: ruleUnits returns [EObject current=null] : ( (lv_statement_0_0= ruleStatements ) )* ;
    public final EObject ruleUnits() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;



        	enterRule();

        try {
            // InternalUnits.g:78:2: ( ( (lv_statement_0_0= ruleStatements ) )* )
            // InternalUnits.g:79:2: ( (lv_statement_0_0= ruleStatements ) )*
            {
            // InternalUnits.g:79:2: ( (lv_statement_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUnits.g:80:3: (lv_statement_0_0= ruleStatements )
            	    {
            	    // InternalUnits.g:80:3: (lv_statement_0_0= ruleStatements )
            	    // InternalUnits.g:81:4: lv_statement_0_0= ruleStatements
            	    {

            	    				newCompositeNode(grammarAccess.getUnitsAccess().getStatementStatementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statement_0_0=ruleStatements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getUnitsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statement",
            	    					lv_statement_0_0,
            	    					"uk.ac.kcl.group32.units.Units.Statements");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnits"


    // $ANTLR start "entryRuleStatements"
    // InternalUnits.g:101:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalUnits.g:101:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalUnits.g:102:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalUnits.g:108:1: ruleStatements returns [EObject current=null] : (this_MassConversion_0= ruleMassConversion | this_LengthConversion_1= ruleLengthConversion | this_TimeConversion_2= ruleTimeConversion | this_VariableDeclaration_3= ruleVariableDeclaration ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_MassConversion_0 = null;

        EObject this_LengthConversion_1 = null;

        EObject this_TimeConversion_2 = null;

        EObject this_VariableDeclaration_3 = null;



        	enterRule();

        try {
            // InternalUnits.g:114:2: ( (this_MassConversion_0= ruleMassConversion | this_LengthConversion_1= ruleLengthConversion | this_TimeConversion_2= ruleTimeConversion | this_VariableDeclaration_3= ruleVariableDeclaration ) )
            // InternalUnits.g:115:2: (this_MassConversion_0= ruleMassConversion | this_LengthConversion_1= ruleLengthConversion | this_TimeConversion_2= ruleTimeConversion | this_VariableDeclaration_3= ruleVariableDeclaration )
            {
            // InternalUnits.g:115:2: (this_MassConversion_0= ruleMassConversion | this_LengthConversion_1= ruleLengthConversion | this_TimeConversion_2= ruleTimeConversion | this_VariableDeclaration_3= ruleVariableDeclaration )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalUnits.g:116:3: this_MassConversion_0= ruleMassConversion
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getMassConversionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MassConversion_0=ruleMassConversion();

                    state._fsp--;


                    			current = this_MassConversion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUnits.g:125:3: this_LengthConversion_1= ruleLengthConversion
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getLengthConversionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LengthConversion_1=ruleLengthConversion();

                    state._fsp--;


                    			current = this_LengthConversion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUnits.g:134:3: this_TimeConversion_2= ruleTimeConversion
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getTimeConversionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeConversion_2=ruleTimeConversion();

                    state._fsp--;


                    			current = this_TimeConversion_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUnits.g:143:3: this_VariableDeclaration_3= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getVariableDeclarationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_3=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalUnits.g:155:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalUnits.g:155:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalUnits.g:156:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalUnits.g:162:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalUnits.g:168:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalUnits.g:169:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalUnits.g:169:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalUnits.g:170:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getLetKeyword_0());
            		
            // InternalUnits.g:174:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnits.g:175:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnits.g:175:4: (lv_name_1_0= RULE_ID )
            // InternalUnits.g:176:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalUnits.g:196:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalUnits.g:197:4: (lv_value_3_0= RULE_INT )
            {
            // InternalUnits.g:197:4: (lv_value_3_0= RULE_INT )
            // InternalUnits.g:198:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleMassConversion"
    // InternalUnits.g:218:1: entryRuleMassConversion returns [EObject current=null] : iv_ruleMassConversion= ruleMassConversion EOF ;
    public final EObject entryRuleMassConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMassConversion = null;


        try {
            // InternalUnits.g:218:55: (iv_ruleMassConversion= ruleMassConversion EOF )
            // InternalUnits.g:219:2: iv_ruleMassConversion= ruleMassConversion EOF
            {
             newCompositeNode(grammarAccess.getMassConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMassConversion=ruleMassConversion();

            state._fsp--;

             current =iv_ruleMassConversion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMassConversion"


    // $ANTLR start "ruleMassConversion"
    // InternalUnits.g:225:1: ruleMassConversion returns [EObject current=null] : (otherlv_0= 'convert' ( (lv_massValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialMassValue_3_0= ruleMassUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedMassValue_6_0= ruleMassUnits ) ) ) ;
    public final EObject ruleMassConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_massValue_1_0 = null;

        Enumerator lv_initialMassValue_3_0 = null;

        Enumerator lv_convertedMassValue_6_0 = null;



        	enterRule();

        try {
            // InternalUnits.g:231:2: ( (otherlv_0= 'convert' ( (lv_massValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialMassValue_3_0= ruleMassUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedMassValue_6_0= ruleMassUnits ) ) ) )
            // InternalUnits.g:232:2: (otherlv_0= 'convert' ( (lv_massValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialMassValue_3_0= ruleMassUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedMassValue_6_0= ruleMassUnits ) ) )
            {
            // InternalUnits.g:232:2: (otherlv_0= 'convert' ( (lv_massValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialMassValue_3_0= ruleMassUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedMassValue_6_0= ruleMassUnits ) ) )
            // InternalUnits.g:233:3: otherlv_0= 'convert' ( (lv_massValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialMassValue_3_0= ruleMassUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedMassValue_6_0= ruleMassUnits ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMassConversionAccess().getConvertKeyword_0());
            		
            // InternalUnits.g:237:3: ( (lv_massValue_1_0= ruleIntExpression ) )
            // InternalUnits.g:238:4: (lv_massValue_1_0= ruleIntExpression )
            {
            // InternalUnits.g:238:4: (lv_massValue_1_0= ruleIntExpression )
            // InternalUnits.g:239:5: lv_massValue_1_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getMassConversionAccess().getMassValueIntExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_massValue_1_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMassConversionRule());
            					}
            					set(
            						current,
            						"massValue",
            						lv_massValue_1_0,
            						"uk.ac.kcl.group32.units.Units.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMassConversionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUnits.g:260:3: ( (lv_initialMassValue_3_0= ruleMassUnits ) )
            // InternalUnits.g:261:4: (lv_initialMassValue_3_0= ruleMassUnits )
            {
            // InternalUnits.g:261:4: (lv_initialMassValue_3_0= ruleMassUnits )
            // InternalUnits.g:262:5: lv_initialMassValue_3_0= ruleMassUnits
            {

            					newCompositeNode(grammarAccess.getMassConversionAccess().getInitialMassValueMassUnitsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_initialMassValue_3_0=ruleMassUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMassConversionRule());
            					}
            					set(
            						current,
            						"initialMassValue",
            						lv_initialMassValue_3_0,
            						"uk.ac.kcl.group32.units.Units.MassUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getMassConversionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMassConversionAccess().getToKeyword_5());
            		
            // InternalUnits.g:287:3: ( (lv_convertedMassValue_6_0= ruleMassUnits ) )
            // InternalUnits.g:288:4: (lv_convertedMassValue_6_0= ruleMassUnits )
            {
            // InternalUnits.g:288:4: (lv_convertedMassValue_6_0= ruleMassUnits )
            // InternalUnits.g:289:5: lv_convertedMassValue_6_0= ruleMassUnits
            {

            					newCompositeNode(grammarAccess.getMassConversionAccess().getConvertedMassValueMassUnitsEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_convertedMassValue_6_0=ruleMassUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMassConversionRule());
            					}
            					set(
            						current,
            						"convertedMassValue",
            						lv_convertedMassValue_6_0,
            						"uk.ac.kcl.group32.units.Units.MassUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMassConversion"


    // $ANTLR start "entryRuleLengthConversion"
    // InternalUnits.g:310:1: entryRuleLengthConversion returns [EObject current=null] : iv_ruleLengthConversion= ruleLengthConversion EOF ;
    public final EObject entryRuleLengthConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLengthConversion = null;


        try {
            // InternalUnits.g:310:57: (iv_ruleLengthConversion= ruleLengthConversion EOF )
            // InternalUnits.g:311:2: iv_ruleLengthConversion= ruleLengthConversion EOF
            {
             newCompositeNode(grammarAccess.getLengthConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLengthConversion=ruleLengthConversion();

            state._fsp--;

             current =iv_ruleLengthConversion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLengthConversion"


    // $ANTLR start "ruleLengthConversion"
    // InternalUnits.g:317:1: ruleLengthConversion returns [EObject current=null] : (otherlv_0= 'convert' ( (lv_lengthValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialLength_3_0= ruleLengthUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedLength_6_0= ruleLengthUnits ) ) ) ;
    public final EObject ruleLengthConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_lengthValue_1_0 = null;

        Enumerator lv_initialLength_3_0 = null;

        Enumerator lv_convertedLength_6_0 = null;



        	enterRule();

        try {
            // InternalUnits.g:323:2: ( (otherlv_0= 'convert' ( (lv_lengthValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialLength_3_0= ruleLengthUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedLength_6_0= ruleLengthUnits ) ) ) )
            // InternalUnits.g:324:2: (otherlv_0= 'convert' ( (lv_lengthValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialLength_3_0= ruleLengthUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedLength_6_0= ruleLengthUnits ) ) )
            {
            // InternalUnits.g:324:2: (otherlv_0= 'convert' ( (lv_lengthValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialLength_3_0= ruleLengthUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedLength_6_0= ruleLengthUnits ) ) )
            // InternalUnits.g:325:3: otherlv_0= 'convert' ( (lv_lengthValue_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialLength_3_0= ruleLengthUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedLength_6_0= ruleLengthUnits ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLengthConversionAccess().getConvertKeyword_0());
            		
            // InternalUnits.g:329:3: ( (lv_lengthValue_1_0= ruleIntExpression ) )
            // InternalUnits.g:330:4: (lv_lengthValue_1_0= ruleIntExpression )
            {
            // InternalUnits.g:330:4: (lv_lengthValue_1_0= ruleIntExpression )
            // InternalUnits.g:331:5: lv_lengthValue_1_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getLengthConversionAccess().getLengthValueIntExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_lengthValue_1_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLengthConversionRule());
            					}
            					set(
            						current,
            						"lengthValue",
            						lv_lengthValue_1_0,
            						"uk.ac.kcl.group32.units.Units.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getLengthConversionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUnits.g:352:3: ( (lv_initialLength_3_0= ruleLengthUnits ) )
            // InternalUnits.g:353:4: (lv_initialLength_3_0= ruleLengthUnits )
            {
            // InternalUnits.g:353:4: (lv_initialLength_3_0= ruleLengthUnits )
            // InternalUnits.g:354:5: lv_initialLength_3_0= ruleLengthUnits
            {

            					newCompositeNode(grammarAccess.getLengthConversionAccess().getInitialLengthLengthUnitsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_initialLength_3_0=ruleLengthUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLengthConversionRule());
            					}
            					set(
            						current,
            						"initialLength",
            						lv_initialLength_3_0,
            						"uk.ac.kcl.group32.units.Units.LengthUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getLengthConversionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getLengthConversionAccess().getToKeyword_5());
            		
            // InternalUnits.g:379:3: ( (lv_convertedLength_6_0= ruleLengthUnits ) )
            // InternalUnits.g:380:4: (lv_convertedLength_6_0= ruleLengthUnits )
            {
            // InternalUnits.g:380:4: (lv_convertedLength_6_0= ruleLengthUnits )
            // InternalUnits.g:381:5: lv_convertedLength_6_0= ruleLengthUnits
            {

            					newCompositeNode(grammarAccess.getLengthConversionAccess().getConvertedLengthLengthUnitsEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_convertedLength_6_0=ruleLengthUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLengthConversionRule());
            					}
            					set(
            						current,
            						"convertedLength",
            						lv_convertedLength_6_0,
            						"uk.ac.kcl.group32.units.Units.LengthUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLengthConversion"


    // $ANTLR start "entryRuleTimeConversion"
    // InternalUnits.g:402:1: entryRuleTimeConversion returns [EObject current=null] : iv_ruleTimeConversion= ruleTimeConversion EOF ;
    public final EObject entryRuleTimeConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeConversion = null;


        try {
            // InternalUnits.g:402:55: (iv_ruleTimeConversion= ruleTimeConversion EOF )
            // InternalUnits.g:403:2: iv_ruleTimeConversion= ruleTimeConversion EOF
            {
             newCompositeNode(grammarAccess.getTimeConversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeConversion=ruleTimeConversion();

            state._fsp--;

             current =iv_ruleTimeConversion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeConversion"


    // $ANTLR start "ruleTimeConversion"
    // InternalUnits.g:409:1: ruleTimeConversion returns [EObject current=null] : (otherlv_0= 'convert' ( (lv_time_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialTime_3_0= ruleTimeUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedTime_6_0= ruleTimeUnits ) ) ) ;
    public final EObject ruleTimeConversion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_time_1_0 = null;

        Enumerator lv_initialTime_3_0 = null;

        Enumerator lv_convertedTime_6_0 = null;



        	enterRule();

        try {
            // InternalUnits.g:415:2: ( (otherlv_0= 'convert' ( (lv_time_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialTime_3_0= ruleTimeUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedTime_6_0= ruleTimeUnits ) ) ) )
            // InternalUnits.g:416:2: (otherlv_0= 'convert' ( (lv_time_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialTime_3_0= ruleTimeUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedTime_6_0= ruleTimeUnits ) ) )
            {
            // InternalUnits.g:416:2: (otherlv_0= 'convert' ( (lv_time_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialTime_3_0= ruleTimeUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedTime_6_0= ruleTimeUnits ) ) )
            // InternalUnits.g:417:3: otherlv_0= 'convert' ( (lv_time_1_0= ruleIntExpression ) ) otherlv_2= '(' ( (lv_initialTime_3_0= ruleTimeUnits ) ) otherlv_4= ')' otherlv_5= 'to' ( (lv_convertedTime_6_0= ruleTimeUnits ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeConversionAccess().getConvertKeyword_0());
            		
            // InternalUnits.g:421:3: ( (lv_time_1_0= ruleIntExpression ) )
            // InternalUnits.g:422:4: (lv_time_1_0= ruleIntExpression )
            {
            // InternalUnits.g:422:4: (lv_time_1_0= ruleIntExpression )
            // InternalUnits.g:423:5: lv_time_1_0= ruleIntExpression
            {

            					newCompositeNode(grammarAccess.getTimeConversionAccess().getTimeIntExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_time_1_0=ruleIntExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeConversionRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_1_0,
            						"uk.ac.kcl.group32.units.Units.IntExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeConversionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalUnits.g:444:3: ( (lv_initialTime_3_0= ruleTimeUnits ) )
            // InternalUnits.g:445:4: (lv_initialTime_3_0= ruleTimeUnits )
            {
            // InternalUnits.g:445:4: (lv_initialTime_3_0= ruleTimeUnits )
            // InternalUnits.g:446:5: lv_initialTime_3_0= ruleTimeUnits
            {

            					newCompositeNode(grammarAccess.getTimeConversionAccess().getInitialTimeTimeUnitsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_initialTime_3_0=ruleTimeUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeConversionRule());
            					}
            					set(
            						current,
            						"initialTime",
            						lv_initialTime_3_0,
            						"uk.ac.kcl.group32.units.Units.TimeUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeConversionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeConversionAccess().getToKeyword_5());
            		
            // InternalUnits.g:471:3: ( (lv_convertedTime_6_0= ruleTimeUnits ) )
            // InternalUnits.g:472:4: (lv_convertedTime_6_0= ruleTimeUnits )
            {
            // InternalUnits.g:472:4: (lv_convertedTime_6_0= ruleTimeUnits )
            // InternalUnits.g:473:5: lv_convertedTime_6_0= ruleTimeUnits
            {

            					newCompositeNode(grammarAccess.getTimeConversionAccess().getConvertedTimeTimeUnitsEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_convertedTime_6_0=ruleTimeUnits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeConversionRule());
            					}
            					set(
            						current,
            						"convertedTime",
            						lv_convertedTime_6_0,
            						"uk.ac.kcl.group32.units.Units.TimeUnits");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeConversion"


    // $ANTLR start "entryRuleIntExpression"
    // InternalUnits.g:494:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalUnits.g:494:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalUnits.g:495:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
             newCompositeNode(grammarAccess.getIntExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;

             current =iv_ruleIntExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalUnits.g:501:1: ruleIntExpression returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral ) ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_IntVarExpression_1 = null;

        EObject this_RealLiteral_2 = null;



        	enterRule();

        try {
            // InternalUnits.g:507:2: ( (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral ) )
            // InternalUnits.g:508:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral )
            {
            // InternalUnits.g:508:2: (this_IntLiteral_0= ruleIntLiteral | this_IntVarExpression_1= ruleIntVarExpression | this_RealLiteral_2= ruleRealLiteral )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==14) ) {
                    alt3=1;
                }
                else if ( (LA3_1==17) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUnits.g:509:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getIntExpressionAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUnits.g:518:3: this_IntVarExpression_1= ruleIntVarExpression
                    {

                    			newCompositeNode(grammarAccess.getIntExpressionAccess().getIntVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntVarExpression_1=ruleIntVarExpression();

                    state._fsp--;


                    			current = this_IntVarExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUnits.g:527:3: this_RealLiteral_2= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getIntExpressionAccess().getRealLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_2=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalUnits.g:539:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalUnits.g:539:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalUnits.g:540:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalUnits.g:546:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalUnits.g:552:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalUnits.g:553:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalUnits.g:553:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalUnits.g:554:3: (lv_val_0_0= RULE_INT )
            {
            // InternalUnits.g:554:3: (lv_val_0_0= RULE_INT )
            // InternalUnits.g:555:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalUnits.g:574:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalUnits.g:574:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalUnits.g:575:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalUnits.g:581:1: ruleRealLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalUnits.g:587:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalUnits.g:588:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalUnits.g:588:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalUnits.g:589:3: (lv_val_0_0= ruleREAL )
            {
            // InternalUnits.g:589:3: (lv_val_0_0= ruleREAL )
            // InternalUnits.g:590:4: lv_val_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"uk.ac.kcl.group32.units.Units.REAL");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalUnits.g:610:1: entryRuleIntVarExpression returns [EObject current=null] : iv_ruleIntVarExpression= ruleIntVarExpression EOF ;
    public final EObject entryRuleIntVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVarExpression = null;


        try {
            // InternalUnits.g:610:57: (iv_ruleIntVarExpression= ruleIntVarExpression EOF )
            // InternalUnits.g:611:2: iv_ruleIntVarExpression= ruleIntVarExpression EOF
            {
             newCompositeNode(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntVarExpression=ruleIntVarExpression();

            state._fsp--;

             current =iv_ruleIntVarExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalUnits.g:617:1: ruleIntVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleIntVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUnits.g:623:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUnits.g:624:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUnits.g:624:2: ( (otherlv_0= RULE_ID ) )
            // InternalUnits.g:625:3: (otherlv_0= RULE_ID )
            {
            // InternalUnits.g:625:3: (otherlv_0= RULE_ID )
            // InternalUnits.g:626:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalUnits.g:640:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalUnits.g:642:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalUnits.g:643:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalUnits.g:652:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalUnits.g:659:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalUnits.g:660:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalUnits.g:660:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalUnits.g:661:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalUnits.g:661:3: (this_INT_0= RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUnits.g:662:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,17,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleMassUnits"
    // InternalUnits.g:689:1: ruleMassUnits returns [Enumerator current=null] : ( (enumLiteral_0= 'kg' ) | (enumLiteral_1= 'g' ) ) ;
    public final Enumerator ruleMassUnits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUnits.g:695:2: ( ( (enumLiteral_0= 'kg' ) | (enumLiteral_1= 'g' ) ) )
            // InternalUnits.g:696:2: ( (enumLiteral_0= 'kg' ) | (enumLiteral_1= 'g' ) )
            {
            // InternalUnits.g:696:2: ( (enumLiteral_0= 'kg' ) | (enumLiteral_1= 'g' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUnits.g:697:3: (enumLiteral_0= 'kg' )
                    {
                    // InternalUnits.g:697:3: (enumLiteral_0= 'kg' )
                    // InternalUnits.g:698:4: enumLiteral_0= 'kg'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getMassUnitsAccess().getKgEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMassUnitsAccess().getKgEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUnits.g:705:3: (enumLiteral_1= 'g' )
                    {
                    // InternalUnits.g:705:3: (enumLiteral_1= 'g' )
                    // InternalUnits.g:706:4: enumLiteral_1= 'g'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getMassUnitsAccess().getGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMassUnitsAccess().getGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMassUnits"


    // $ANTLR start "ruleTimeUnits"
    // InternalUnits.g:716:1: ruleTimeUnits returns [Enumerator current=null] : ( (enumLiteral_0= 'hr' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 's' ) ) ;
    public final Enumerator ruleTimeUnits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUnits.g:722:2: ( ( (enumLiteral_0= 'hr' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 's' ) ) )
            // InternalUnits.g:723:2: ( (enumLiteral_0= 'hr' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 's' ) )
            {
            // InternalUnits.g:723:2: ( (enumLiteral_0= 'hr' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 's' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
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
                    // InternalUnits.g:724:3: (enumLiteral_0= 'hr' )
                    {
                    // InternalUnits.g:724:3: (enumLiteral_0= 'hr' )
                    // InternalUnits.g:725:4: enumLiteral_0= 'hr'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getHrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitsAccess().getHrEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUnits.g:732:3: (enumLiteral_1= 'm' )
                    {
                    // InternalUnits.g:732:3: (enumLiteral_1= 'm' )
                    // InternalUnits.g:733:4: enumLiteral_1= 'm'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitsAccess().getMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUnits.g:740:3: (enumLiteral_2= 's' )
                    {
                    // InternalUnits.g:740:3: (enumLiteral_2= 's' )
                    // InternalUnits.g:741:4: enumLiteral_2= 's'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitsAccess().getSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitsAccess().getSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnits"


    // $ANTLR start "ruleLengthUnits"
    // InternalUnits.g:751:1: ruleLengthUnits returns [Enumerator current=null] : ( (enumLiteral_0= 'km' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'cm' ) ) ;
    public final Enumerator ruleLengthUnits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUnits.g:757:2: ( ( (enumLiteral_0= 'km' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'cm' ) ) )
            // InternalUnits.g:758:2: ( (enumLiteral_0= 'km' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'cm' ) )
            {
            // InternalUnits.g:758:2: ( (enumLiteral_0= 'km' ) | (enumLiteral_1= 'm' ) | (enumLiteral_2= 'cm' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUnits.g:759:3: (enumLiteral_0= 'km' )
                    {
                    // InternalUnits.g:759:3: (enumLiteral_0= 'km' )
                    // InternalUnits.g:760:4: enumLiteral_0= 'km'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getLengthUnitsAccess().getKmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLengthUnitsAccess().getKmEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUnits.g:767:3: (enumLiteral_1= 'm' )
                    {
                    // InternalUnits.g:767:3: (enumLiteral_1= 'm' )
                    // InternalUnits.g:768:4: enumLiteral_1= 'm'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getLengthUnitsAccess().getMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLengthUnitsAccess().getMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUnits.g:775:3: (enumLiteral_2= 'cm' )
                    {
                    // InternalUnits.g:775:3: (enumLiteral_2= 'cm' )
                    // InternalUnits.g:776:4: enumLiteral_2= 'cm'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getLengthUnitsAccess().getCmEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLengthUnitsAccess().getCmEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLengthUnits"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\13\1\4\1\uffff\2\16\1\5\1\22\1\16\1\uffff\1\17\2\uffff\1\20\1\24\1\uffff";
    static final String dfa_3s = "\1\15\1\21\1\uffff\1\21\1\16\1\5\1\30\1\16\1\uffff\1\17\2\uffff\1\20\1\30\1\uffff";
    static final String dfa_4s = "\2\uffff\1\4\5\uffff\1\3\1\uffff\1\2\1\1\2\uffff\1\2";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1",
            "\1\4\1\3\13\uffff\1\5",
            "",
            "\1\6\2\uffff\1\5",
            "\1\6",
            "\1\7",
            "\2\13\1\10\1\11\1\10\2\12",
            "\1\6",
            "",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\10\1\16\1\10\2\16",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "115:2: (this_MassConversion_0= ruleMassConversion | this_LengthConversion_1= ruleLengthConversion | this_TimeConversion_2= ruleTimeConversion | this_VariableDeclaration_3= ruleVariableDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});

}