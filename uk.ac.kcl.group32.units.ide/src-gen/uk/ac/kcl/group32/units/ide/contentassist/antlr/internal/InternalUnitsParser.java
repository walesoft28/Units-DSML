package uk.ac.kcl.group32.units.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.group32.units.services.UnitsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnitsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'kg'", "'g'", "'hr'", "'m'", "'s'", "'km'", "'cm'", "'let'", "'='", "'convert'", "'('", "')'", "'to'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(UnitsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUnits"
    // InternalUnits.g:53:1: entryRuleUnits : ruleUnits EOF ;
    public final void entryRuleUnits() throws RecognitionException {
        try {
            // InternalUnits.g:54:1: ( ruleUnits EOF )
            // InternalUnits.g:55:1: ruleUnits EOF
            {
             before(grammarAccess.getUnitsRule()); 
            pushFollow(FOLLOW_1);
            ruleUnits();

            state._fsp--;

             after(grammarAccess.getUnitsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnits"


    // $ANTLR start "ruleUnits"
    // InternalUnits.g:62:1: ruleUnits : ( ( rule__Units__StatementAssignment )* ) ;
    public final void ruleUnits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:66:2: ( ( ( rule__Units__StatementAssignment )* ) )
            // InternalUnits.g:67:2: ( ( rule__Units__StatementAssignment )* )
            {
            // InternalUnits.g:67:2: ( ( rule__Units__StatementAssignment )* )
            // InternalUnits.g:68:3: ( rule__Units__StatementAssignment )*
            {
             before(grammarAccess.getUnitsAccess().getStatementAssignment()); 
            // InternalUnits.g:69:3: ( rule__Units__StatementAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUnits.g:69:4: rule__Units__StatementAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Units__StatementAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getUnitsAccess().getStatementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnits"


    // $ANTLR start "entryRuleStatements"
    // InternalUnits.g:78:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalUnits.g:79:1: ( ruleStatements EOF )
            // InternalUnits.g:80:1: ruleStatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalUnits.g:87:1: ruleStatements : ( ( rule__Statements__Alternatives ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:91:2: ( ( ( rule__Statements__Alternatives ) ) )
            // InternalUnits.g:92:2: ( ( rule__Statements__Alternatives ) )
            {
            // InternalUnits.g:92:2: ( ( rule__Statements__Alternatives ) )
            // InternalUnits.g:93:3: ( rule__Statements__Alternatives )
            {
             before(grammarAccess.getStatementsAccess().getAlternatives()); 
            // InternalUnits.g:94:3: ( rule__Statements__Alternatives )
            // InternalUnits.g:94:4: rule__Statements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalUnits.g:103:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalUnits.g:104:1: ( ruleVariableDeclaration EOF )
            // InternalUnits.g:105:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalUnits.g:112:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:116:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalUnits.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalUnits.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalUnits.g:118:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalUnits.g:119:3: ( rule__VariableDeclaration__Group__0 )
            // InternalUnits.g:119:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleMassConversion"
    // InternalUnits.g:128:1: entryRuleMassConversion : ruleMassConversion EOF ;
    public final void entryRuleMassConversion() throws RecognitionException {
        try {
            // InternalUnits.g:129:1: ( ruleMassConversion EOF )
            // InternalUnits.g:130:1: ruleMassConversion EOF
            {
             before(grammarAccess.getMassConversionRule()); 
            pushFollow(FOLLOW_1);
            ruleMassConversion();

            state._fsp--;

             after(grammarAccess.getMassConversionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMassConversion"


    // $ANTLR start "ruleMassConversion"
    // InternalUnits.g:137:1: ruleMassConversion : ( ( rule__MassConversion__Group__0 ) ) ;
    public final void ruleMassConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:141:2: ( ( ( rule__MassConversion__Group__0 ) ) )
            // InternalUnits.g:142:2: ( ( rule__MassConversion__Group__0 ) )
            {
            // InternalUnits.g:142:2: ( ( rule__MassConversion__Group__0 ) )
            // InternalUnits.g:143:3: ( rule__MassConversion__Group__0 )
            {
             before(grammarAccess.getMassConversionAccess().getGroup()); 
            // InternalUnits.g:144:3: ( rule__MassConversion__Group__0 )
            // InternalUnits.g:144:4: rule__MassConversion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MassConversion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassConversionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMassConversion"


    // $ANTLR start "entryRuleLengthConversion"
    // InternalUnits.g:153:1: entryRuleLengthConversion : ruleLengthConversion EOF ;
    public final void entryRuleLengthConversion() throws RecognitionException {
        try {
            // InternalUnits.g:154:1: ( ruleLengthConversion EOF )
            // InternalUnits.g:155:1: ruleLengthConversion EOF
            {
             before(grammarAccess.getLengthConversionRule()); 
            pushFollow(FOLLOW_1);
            ruleLengthConversion();

            state._fsp--;

             after(grammarAccess.getLengthConversionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLengthConversion"


    // $ANTLR start "ruleLengthConversion"
    // InternalUnits.g:162:1: ruleLengthConversion : ( ( rule__LengthConversion__Group__0 ) ) ;
    public final void ruleLengthConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:166:2: ( ( ( rule__LengthConversion__Group__0 ) ) )
            // InternalUnits.g:167:2: ( ( rule__LengthConversion__Group__0 ) )
            {
            // InternalUnits.g:167:2: ( ( rule__LengthConversion__Group__0 ) )
            // InternalUnits.g:168:3: ( rule__LengthConversion__Group__0 )
            {
             before(grammarAccess.getLengthConversionAccess().getGroup()); 
            // InternalUnits.g:169:3: ( rule__LengthConversion__Group__0 )
            // InternalUnits.g:169:4: rule__LengthConversion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LengthConversion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLengthConversionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLengthConversion"


    // $ANTLR start "entryRuleTimeConversion"
    // InternalUnits.g:178:1: entryRuleTimeConversion : ruleTimeConversion EOF ;
    public final void entryRuleTimeConversion() throws RecognitionException {
        try {
            // InternalUnits.g:179:1: ( ruleTimeConversion EOF )
            // InternalUnits.g:180:1: ruleTimeConversion EOF
            {
             before(grammarAccess.getTimeConversionRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeConversion();

            state._fsp--;

             after(grammarAccess.getTimeConversionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimeConversion"


    // $ANTLR start "ruleTimeConversion"
    // InternalUnits.g:187:1: ruleTimeConversion : ( ( rule__TimeConversion__Group__0 ) ) ;
    public final void ruleTimeConversion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:191:2: ( ( ( rule__TimeConversion__Group__0 ) ) )
            // InternalUnits.g:192:2: ( ( rule__TimeConversion__Group__0 ) )
            {
            // InternalUnits.g:192:2: ( ( rule__TimeConversion__Group__0 ) )
            // InternalUnits.g:193:3: ( rule__TimeConversion__Group__0 )
            {
             before(grammarAccess.getTimeConversionAccess().getGroup()); 
            // InternalUnits.g:194:3: ( rule__TimeConversion__Group__0 )
            // InternalUnits.g:194:4: rule__TimeConversion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeConversion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeConversionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeConversion"


    // $ANTLR start "entryRuleIntExpression"
    // InternalUnits.g:203:1: entryRuleIntExpression : ruleIntExpression EOF ;
    public final void entryRuleIntExpression() throws RecognitionException {
        try {
            // InternalUnits.g:204:1: ( ruleIntExpression EOF )
            // InternalUnits.g:205:1: ruleIntExpression EOF
            {
             before(grammarAccess.getIntExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntExpression();

            state._fsp--;

             after(grammarAccess.getIntExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalUnits.g:212:1: ruleIntExpression : ( ( rule__IntExpression__Alternatives ) ) ;
    public final void ruleIntExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:216:2: ( ( ( rule__IntExpression__Alternatives ) ) )
            // InternalUnits.g:217:2: ( ( rule__IntExpression__Alternatives ) )
            {
            // InternalUnits.g:217:2: ( ( rule__IntExpression__Alternatives ) )
            // InternalUnits.g:218:3: ( rule__IntExpression__Alternatives )
            {
             before(grammarAccess.getIntExpressionAccess().getAlternatives()); 
            // InternalUnits.g:219:3: ( rule__IntExpression__Alternatives )
            // InternalUnits.g:219:4: rule__IntExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalUnits.g:228:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalUnits.g:229:1: ( ruleIntLiteral EOF )
            // InternalUnits.g:230:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalUnits.g:237:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:241:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalUnits.g:242:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalUnits.g:242:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalUnits.g:243:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalUnits.g:244:3: ( rule__IntLiteral__ValAssignment )
            // InternalUnits.g:244:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalUnits.g:253:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalUnits.g:254:1: ( ruleRealLiteral EOF )
            // InternalUnits.g:255:1: ruleRealLiteral EOF
            {
             before(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteral();

            state._fsp--;

             after(grammarAccess.getRealLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalUnits.g:262:1: ruleRealLiteral : ( ( rule__RealLiteral__ValAssignment ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:266:2: ( ( ( rule__RealLiteral__ValAssignment ) ) )
            // InternalUnits.g:267:2: ( ( rule__RealLiteral__ValAssignment ) )
            {
            // InternalUnits.g:267:2: ( ( rule__RealLiteral__ValAssignment ) )
            // InternalUnits.g:268:3: ( rule__RealLiteral__ValAssignment )
            {
             before(grammarAccess.getRealLiteralAccess().getValAssignment()); 
            // InternalUnits.g:269:3: ( rule__RealLiteral__ValAssignment )
            // InternalUnits.g:269:4: rule__RealLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntVarExpression"
    // InternalUnits.g:278:1: entryRuleIntVarExpression : ruleIntVarExpression EOF ;
    public final void entryRuleIntVarExpression() throws RecognitionException {
        try {
            // InternalUnits.g:279:1: ( ruleIntVarExpression EOF )
            // InternalUnits.g:280:1: ruleIntVarExpression EOF
            {
             before(grammarAccess.getIntVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntVarExpression();

            state._fsp--;

             after(grammarAccess.getIntVarExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntVarExpression"


    // $ANTLR start "ruleIntVarExpression"
    // InternalUnits.g:287:1: ruleIntVarExpression : ( ( rule__IntVarExpression__VarAssignment ) ) ;
    public final void ruleIntVarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:291:2: ( ( ( rule__IntVarExpression__VarAssignment ) ) )
            // InternalUnits.g:292:2: ( ( rule__IntVarExpression__VarAssignment ) )
            {
            // InternalUnits.g:292:2: ( ( rule__IntVarExpression__VarAssignment ) )
            // InternalUnits.g:293:3: ( rule__IntVarExpression__VarAssignment )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 
            // InternalUnits.g:294:3: ( rule__IntVarExpression__VarAssignment )
            // InternalUnits.g:294:4: rule__IntVarExpression__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntVarExpression__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntVarExpressionAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntVarExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalUnits.g:303:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalUnits.g:307:1: ( ruleREAL EOF )
            // InternalUnits.g:308:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalUnits.g:318:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:323:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalUnits.g:324:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalUnits.g:324:2: ( ( rule__REAL__Group__0 ) )
            // InternalUnits.g:325:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalUnits.g:326:3: ( rule__REAL__Group__0 )
            // InternalUnits.g:326:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "ruleMassUnits"
    // InternalUnits.g:336:1: ruleMassUnits : ( ( rule__MassUnits__Alternatives ) ) ;
    public final void ruleMassUnits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:340:1: ( ( ( rule__MassUnits__Alternatives ) ) )
            // InternalUnits.g:341:2: ( ( rule__MassUnits__Alternatives ) )
            {
            // InternalUnits.g:341:2: ( ( rule__MassUnits__Alternatives ) )
            // InternalUnits.g:342:3: ( rule__MassUnits__Alternatives )
            {
             before(grammarAccess.getMassUnitsAccess().getAlternatives()); 
            // InternalUnits.g:343:3: ( rule__MassUnits__Alternatives )
            // InternalUnits.g:343:4: rule__MassUnits__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MassUnits__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMassUnitsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMassUnits"


    // $ANTLR start "ruleTimeUnits"
    // InternalUnits.g:352:1: ruleTimeUnits : ( ( rule__TimeUnits__Alternatives ) ) ;
    public final void ruleTimeUnits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:356:1: ( ( ( rule__TimeUnits__Alternatives ) ) )
            // InternalUnits.g:357:2: ( ( rule__TimeUnits__Alternatives ) )
            {
            // InternalUnits.g:357:2: ( ( rule__TimeUnits__Alternatives ) )
            // InternalUnits.g:358:3: ( rule__TimeUnits__Alternatives )
            {
             before(grammarAccess.getTimeUnitsAccess().getAlternatives()); 
            // InternalUnits.g:359:3: ( rule__TimeUnits__Alternatives )
            // InternalUnits.g:359:4: rule__TimeUnits__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnits__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnits"


    // $ANTLR start "ruleLengthUnits"
    // InternalUnits.g:368:1: ruleLengthUnits : ( ( rule__LengthUnits__Alternatives ) ) ;
    public final void ruleLengthUnits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:372:1: ( ( ( rule__LengthUnits__Alternatives ) ) )
            // InternalUnits.g:373:2: ( ( rule__LengthUnits__Alternatives ) )
            {
            // InternalUnits.g:373:2: ( ( rule__LengthUnits__Alternatives ) )
            // InternalUnits.g:374:3: ( rule__LengthUnits__Alternatives )
            {
             before(grammarAccess.getLengthUnitsAccess().getAlternatives()); 
            // InternalUnits.g:375:3: ( rule__LengthUnits__Alternatives )
            // InternalUnits.g:375:4: rule__LengthUnits__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LengthUnits__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLengthUnitsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLengthUnits"


    // $ANTLR start "rule__Statements__Alternatives"
    // InternalUnits.g:383:1: rule__Statements__Alternatives : ( ( ruleMassConversion ) | ( ruleLengthConversion ) | ( ruleTimeConversion ) | ( ruleVariableDeclaration ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:387:1: ( ( ruleMassConversion ) | ( ruleLengthConversion ) | ( ruleTimeConversion ) | ( ruleVariableDeclaration ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalUnits.g:388:2: ( ruleMassConversion )
                    {
                    // InternalUnits.g:388:2: ( ruleMassConversion )
                    // InternalUnits.g:389:3: ruleMassConversion
                    {
                     before(grammarAccess.getStatementsAccess().getMassConversionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMassConversion();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getMassConversionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnits.g:394:2: ( ruleLengthConversion )
                    {
                    // InternalUnits.g:394:2: ( ruleLengthConversion )
                    // InternalUnits.g:395:3: ruleLengthConversion
                    {
                     before(grammarAccess.getStatementsAccess().getLengthConversionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLengthConversion();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getLengthConversionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnits.g:400:2: ( ruleTimeConversion )
                    {
                    // InternalUnits.g:400:2: ( ruleTimeConversion )
                    // InternalUnits.g:401:3: ruleTimeConversion
                    {
                     before(grammarAccess.getStatementsAccess().getTimeConversionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeConversion();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getTimeConversionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUnits.g:406:2: ( ruleVariableDeclaration )
                    {
                    // InternalUnits.g:406:2: ( ruleVariableDeclaration )
                    // InternalUnits.g:407:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementsAccess().getVariableDeclarationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getVariableDeclarationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Alternatives"


    // $ANTLR start "rule__IntExpression__Alternatives"
    // InternalUnits.g:416:1: rule__IntExpression__Alternatives : ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) );
    public final void rule__IntExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:420:1: ( ( ruleIntLiteral ) | ( ruleIntVarExpression ) | ( ruleRealLiteral ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==21) ) {
                    alt3=1;
                }
                else if ( (LA3_1==24) ) {
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
            case 24:
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
                    // InternalUnits.g:421:2: ( ruleIntLiteral )
                    {
                    // InternalUnits.g:421:2: ( ruleIntLiteral )
                    // InternalUnits.g:422:3: ruleIntLiteral
                    {
                     before(grammarAccess.getIntExpressionAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getIntExpressionAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnits.g:427:2: ( ruleIntVarExpression )
                    {
                    // InternalUnits.g:427:2: ( ruleIntVarExpression )
                    // InternalUnits.g:428:3: ruleIntVarExpression
                    {
                     before(grammarAccess.getIntExpressionAccess().getIntVarExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntVarExpression();

                    state._fsp--;

                     after(grammarAccess.getIntExpressionAccess().getIntVarExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnits.g:433:2: ( ruleRealLiteral )
                    {
                    // InternalUnits.g:433:2: ( ruleRealLiteral )
                    // InternalUnits.g:434:3: ruleRealLiteral
                    {
                     before(grammarAccess.getIntExpressionAccess().getRealLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getIntExpressionAccess().getRealLiteralParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntExpression__Alternatives"


    // $ANTLR start "rule__MassUnits__Alternatives"
    // InternalUnits.g:443:1: rule__MassUnits__Alternatives : ( ( ( 'kg' ) ) | ( ( 'g' ) ) );
    public final void rule__MassUnits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:447:1: ( ( ( 'kg' ) ) | ( ( 'g' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUnits.g:448:2: ( ( 'kg' ) )
                    {
                    // InternalUnits.g:448:2: ( ( 'kg' ) )
                    // InternalUnits.g:449:3: ( 'kg' )
                    {
                     before(grammarAccess.getMassUnitsAccess().getKgEnumLiteralDeclaration_0()); 
                    // InternalUnits.g:450:3: ( 'kg' )
                    // InternalUnits.g:450:4: 'kg'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMassUnitsAccess().getKgEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnits.g:454:2: ( ( 'g' ) )
                    {
                    // InternalUnits.g:454:2: ( ( 'g' ) )
                    // InternalUnits.g:455:3: ( 'g' )
                    {
                     before(grammarAccess.getMassUnitsAccess().getGEnumLiteralDeclaration_1()); 
                    // InternalUnits.g:456:3: ( 'g' )
                    // InternalUnits.g:456:4: 'g'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMassUnitsAccess().getGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassUnits__Alternatives"


    // $ANTLR start "rule__TimeUnits__Alternatives"
    // InternalUnits.g:464:1: rule__TimeUnits__Alternatives : ( ( ( 'hr' ) ) | ( ( 'm' ) ) | ( ( 's' ) ) );
    public final void rule__TimeUnits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:468:1: ( ( ( 'hr' ) ) | ( ( 'm' ) ) | ( ( 's' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUnits.g:469:2: ( ( 'hr' ) )
                    {
                    // InternalUnits.g:469:2: ( ( 'hr' ) )
                    // InternalUnits.g:470:3: ( 'hr' )
                    {
                     before(grammarAccess.getTimeUnitsAccess().getHrEnumLiteralDeclaration_0()); 
                    // InternalUnits.g:471:3: ( 'hr' )
                    // InternalUnits.g:471:4: 'hr'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitsAccess().getHrEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnits.g:475:2: ( ( 'm' ) )
                    {
                    // InternalUnits.g:475:2: ( ( 'm' ) )
                    // InternalUnits.g:476:3: ( 'm' )
                    {
                     before(grammarAccess.getTimeUnitsAccess().getMEnumLiteralDeclaration_1()); 
                    // InternalUnits.g:477:3: ( 'm' )
                    // InternalUnits.g:477:4: 'm'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitsAccess().getMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnits.g:481:2: ( ( 's' ) )
                    {
                    // InternalUnits.g:481:2: ( ( 's' ) )
                    // InternalUnits.g:482:3: ( 's' )
                    {
                     before(grammarAccess.getTimeUnitsAccess().getSEnumLiteralDeclaration_2()); 
                    // InternalUnits.g:483:3: ( 's' )
                    // InternalUnits.g:483:4: 's'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitsAccess().getSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnits__Alternatives"


    // $ANTLR start "rule__LengthUnits__Alternatives"
    // InternalUnits.g:491:1: rule__LengthUnits__Alternatives : ( ( ( 'km' ) ) | ( ( 'm' ) ) | ( ( 'cm' ) ) );
    public final void rule__LengthUnits__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:495:1: ( ( ( 'km' ) ) | ( ( 'm' ) ) | ( ( 'cm' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 17:
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
                    // InternalUnits.g:496:2: ( ( 'km' ) )
                    {
                    // InternalUnits.g:496:2: ( ( 'km' ) )
                    // InternalUnits.g:497:3: ( 'km' )
                    {
                     before(grammarAccess.getLengthUnitsAccess().getKmEnumLiteralDeclaration_0()); 
                    // InternalUnits.g:498:3: ( 'km' )
                    // InternalUnits.g:498:4: 'km'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLengthUnitsAccess().getKmEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnits.g:502:2: ( ( 'm' ) )
                    {
                    // InternalUnits.g:502:2: ( ( 'm' ) )
                    // InternalUnits.g:503:3: ( 'm' )
                    {
                     before(grammarAccess.getLengthUnitsAccess().getMEnumLiteralDeclaration_1()); 
                    // InternalUnits.g:504:3: ( 'm' )
                    // InternalUnits.g:504:4: 'm'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLengthUnitsAccess().getMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnits.g:508:2: ( ( 'cm' ) )
                    {
                    // InternalUnits.g:508:2: ( ( 'cm' ) )
                    // InternalUnits.g:509:3: ( 'cm' )
                    {
                     before(grammarAccess.getLengthUnitsAccess().getCmEnumLiteralDeclaration_2()); 
                    // InternalUnits.g:510:3: ( 'cm' )
                    // InternalUnits.g:510:4: 'cm'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLengthUnitsAccess().getCmEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthUnits__Alternatives"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalUnits.g:518:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:522:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalUnits.g:523:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalUnits.g:530:1: rule__VariableDeclaration__Group__0__Impl : ( 'let' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:534:1: ( ( 'let' ) )
            // InternalUnits.g:535:1: ( 'let' )
            {
            // InternalUnits.g:535:1: ( 'let' )
            // InternalUnits.g:536:2: 'let'
            {
             before(grammarAccess.getVariableDeclarationAccess().getLetKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalUnits.g:545:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:549:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalUnits.g:550:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalUnits.g:557:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:561:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalUnits.g:562:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalUnits.g:562:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalUnits.g:563:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalUnits.g:564:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalUnits.g:564:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalUnits.g:572:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:576:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalUnits.g:577:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalUnits.g:584:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:588:1: ( ( '=' ) )
            // InternalUnits.g:589:1: ( '=' )
            {
            // InternalUnits.g:589:1: ( '=' )
            // InternalUnits.g:590:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalUnits.g:599:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:603:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalUnits.g:604:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalUnits.g:610:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:614:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalUnits.g:615:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalUnits.g:615:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalUnits.g:616:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalUnits.g:617:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalUnits.g:617:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__MassConversion__Group__0"
    // InternalUnits.g:626:1: rule__MassConversion__Group__0 : rule__MassConversion__Group__0__Impl rule__MassConversion__Group__1 ;
    public final void rule__MassConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:630:1: ( rule__MassConversion__Group__0__Impl rule__MassConversion__Group__1 )
            // InternalUnits.g:631:2: rule__MassConversion__Group__0__Impl rule__MassConversion__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MassConversion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MassConversion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__0"


    // $ANTLR start "rule__MassConversion__Group__0__Impl"
    // InternalUnits.g:638:1: rule__MassConversion__Group__0__Impl : ( 'convert' ) ;
    public final void rule__MassConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:642:1: ( ( 'convert' ) )
            // InternalUnits.g:643:1: ( 'convert' )
            {
            // InternalUnits.g:643:1: ( 'convert' )
            // InternalUnits.g:644:2: 'convert'
            {
             before(grammarAccess.getMassConversionAccess().getConvertKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMassConversionAccess().getConvertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__0__Impl"


    // $ANTLR start "rule__MassConversion__Group__1"
    // InternalUnits.g:653:1: rule__MassConversion__Group__1 : rule__MassConversion__Group__1__Impl rule__MassConversion__Group__2 ;
    public final void rule__MassConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:657:1: ( rule__MassConversion__Group__1__Impl rule__MassConversion__Group__2 )
            // InternalUnits.g:658:2: rule__MassConversion__Group__1__Impl rule__MassConversion__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MassConversion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MassConversion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__1"


    // $ANTLR start "rule__MassConversion__Group__1__Impl"
    // InternalUnits.g:665:1: rule__MassConversion__Group__1__Impl : ( ( rule__MassConversion__MassValueAssignment_1 ) ) ;
    public final void rule__MassConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:669:1: ( ( ( rule__MassConversion__MassValueAssignment_1 ) ) )
            // InternalUnits.g:670:1: ( ( rule__MassConversion__MassValueAssignment_1 ) )
            {
            // InternalUnits.g:670:1: ( ( rule__MassConversion__MassValueAssignment_1 ) )
            // InternalUnits.g:671:2: ( rule__MassConversion__MassValueAssignment_1 )
            {
             before(grammarAccess.getMassConversionAccess().getMassValueAssignment_1()); 
            // InternalUnits.g:672:2: ( rule__MassConversion__MassValueAssignment_1 )
            // InternalUnits.g:672:3: rule__MassConversion__MassValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MassConversion__MassValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMassConversionAccess().getMassValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__1__Impl"


    // $ANTLR start "rule__MassConversion__Group__2"
    // InternalUnits.g:680:1: rule__MassConversion__Group__2 : rule__MassConversion__Group__2__Impl rule__MassConversion__Group__3 ;
    public final void rule__MassConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:684:1: ( rule__MassConversion__Group__2__Impl rule__MassConversion__Group__3 )
            // InternalUnits.g:685:2: rule__MassConversion__Group__2__Impl rule__MassConversion__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MassConversion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MassConversion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__2"


    // $ANTLR start "rule__MassConversion__Group__2__Impl"
    // InternalUnits.g:692:1: rule__MassConversion__Group__2__Impl : ( '(' ) ;
    public final void rule__MassConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:696:1: ( ( '(' ) )
            // InternalUnits.g:697:1: ( '(' )
            {
            // InternalUnits.g:697:1: ( '(' )
            // InternalUnits.g:698:2: '('
            {
             before(grammarAccess.getMassConversionAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMassConversionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__2__Impl"


    // $ANTLR start "rule__MassConversion__Group__3"
    // InternalUnits.g:707:1: rule__MassConversion__Group__3 : rule__MassConversion__Group__3__Impl rule__MassConversion__Group__4 ;
    public final void rule__MassConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:711:1: ( rule__MassConversion__Group__3__Impl rule__MassConversion__Group__4 )
            // InternalUnits.g:712:2: rule__MassConversion__Group__3__Impl rule__MassConversion__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__MassConversion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MassConversion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__3"


    // $ANTLR start "rule__MassConversion__Group__3__Impl"
    // InternalUnits.g:719:1: rule__MassConversion__Group__3__Impl : ( ( rule__MassConversion__InitialMassValueAssignment_3 ) ) ;
    public final void rule__MassConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:723:1: ( ( ( rule__MassConversion__InitialMassValueAssignment_3 ) ) )
            // InternalUnits.g:724:1: ( ( rule__MassConversion__InitialMassValueAssignment_3 ) )
            {
            // InternalUnits.g:724:1: ( ( rule__MassConversion__InitialMassValueAssignment_3 ) )
            // InternalUnits.g:725:2: ( rule__MassConversion__InitialMassValueAssignment_3 )
            {
             before(grammarAccess.getMassConversionAccess().getInitialMassValueAssignment_3()); 
            // InternalUnits.g:726:2: ( rule__MassConversion__InitialMassValueAssignment_3 )
            // InternalUnits.g:726:3: rule__MassConversion__InitialMassValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MassConversion__InitialMassValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMassConversionAccess().getInitialMassValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__3__Impl"


    // $ANTLR start "rule__MassConversion__Group__4"
    // InternalUnits.g:734:1: rule__MassConversion__Group__4 : rule__MassConversion__Group__4__Impl rule__MassConversion__Group__5 ;
    public final void rule__MassConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:738:1: ( rule__MassConversion__Group__4__Impl rule__MassConversion__Group__5 )
            // InternalUnits.g:739:2: rule__MassConversion__Group__4__Impl rule__MassConversion__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MassConversion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MassConversion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__4"


    // $ANTLR start "rule__MassConversion__Group__4__Impl"
    // InternalUnits.g:746:1: rule__MassConversion__Group__4__Impl : ( ')' ) ;
    public final void rule__MassConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:750:1: ( ( ')' ) )
            // InternalUnits.g:751:1: ( ')' )
            {
            // InternalUnits.g:751:1: ( ')' )
            // InternalUnits.g:752:2: ')'
            {
             before(grammarAccess.getMassConversionAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMassConversionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__4__Impl"


    // $ANTLR start "rule__MassConversion__Group__5"
    // InternalUnits.g:761:1: rule__MassConversion__Group__5 : rule__MassConversion__Group__5__Impl rule__MassConversion__Group__6 ;
    public final void rule__MassConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:765:1: ( rule__MassConversion__Group__5__Impl rule__MassConversion__Group__6 )
            // InternalUnits.g:766:2: rule__MassConversion__Group__5__Impl rule__MassConversion__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__MassConversion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MassConversion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__5"


    // $ANTLR start "rule__MassConversion__Group__5__Impl"
    // InternalUnits.g:773:1: rule__MassConversion__Group__5__Impl : ( 'to' ) ;
    public final void rule__MassConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:777:1: ( ( 'to' ) )
            // InternalUnits.g:778:1: ( 'to' )
            {
            // InternalUnits.g:778:1: ( 'to' )
            // InternalUnits.g:779:2: 'to'
            {
             before(grammarAccess.getMassConversionAccess().getToKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMassConversionAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__5__Impl"


    // $ANTLR start "rule__MassConversion__Group__6"
    // InternalUnits.g:788:1: rule__MassConversion__Group__6 : rule__MassConversion__Group__6__Impl ;
    public final void rule__MassConversion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:792:1: ( rule__MassConversion__Group__6__Impl )
            // InternalUnits.g:793:2: rule__MassConversion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MassConversion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__6"


    // $ANTLR start "rule__MassConversion__Group__6__Impl"
    // InternalUnits.g:799:1: rule__MassConversion__Group__6__Impl : ( ( rule__MassConversion__ConvertedMassValueAssignment_6 ) ) ;
    public final void rule__MassConversion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:803:1: ( ( ( rule__MassConversion__ConvertedMassValueAssignment_6 ) ) )
            // InternalUnits.g:804:1: ( ( rule__MassConversion__ConvertedMassValueAssignment_6 ) )
            {
            // InternalUnits.g:804:1: ( ( rule__MassConversion__ConvertedMassValueAssignment_6 ) )
            // InternalUnits.g:805:2: ( rule__MassConversion__ConvertedMassValueAssignment_6 )
            {
             before(grammarAccess.getMassConversionAccess().getConvertedMassValueAssignment_6()); 
            // InternalUnits.g:806:2: ( rule__MassConversion__ConvertedMassValueAssignment_6 )
            // InternalUnits.g:806:3: rule__MassConversion__ConvertedMassValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MassConversion__ConvertedMassValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMassConversionAccess().getConvertedMassValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__Group__6__Impl"


    // $ANTLR start "rule__LengthConversion__Group__0"
    // InternalUnits.g:815:1: rule__LengthConversion__Group__0 : rule__LengthConversion__Group__0__Impl rule__LengthConversion__Group__1 ;
    public final void rule__LengthConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:819:1: ( rule__LengthConversion__Group__0__Impl rule__LengthConversion__Group__1 )
            // InternalUnits.g:820:2: rule__LengthConversion__Group__0__Impl rule__LengthConversion__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LengthConversion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthConversion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__0"


    // $ANTLR start "rule__LengthConversion__Group__0__Impl"
    // InternalUnits.g:827:1: rule__LengthConversion__Group__0__Impl : ( 'convert' ) ;
    public final void rule__LengthConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:831:1: ( ( 'convert' ) )
            // InternalUnits.g:832:1: ( 'convert' )
            {
            // InternalUnits.g:832:1: ( 'convert' )
            // InternalUnits.g:833:2: 'convert'
            {
             before(grammarAccess.getLengthConversionAccess().getConvertKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLengthConversionAccess().getConvertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__0__Impl"


    // $ANTLR start "rule__LengthConversion__Group__1"
    // InternalUnits.g:842:1: rule__LengthConversion__Group__1 : rule__LengthConversion__Group__1__Impl rule__LengthConversion__Group__2 ;
    public final void rule__LengthConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:846:1: ( rule__LengthConversion__Group__1__Impl rule__LengthConversion__Group__2 )
            // InternalUnits.g:847:2: rule__LengthConversion__Group__1__Impl rule__LengthConversion__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LengthConversion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthConversion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__1"


    // $ANTLR start "rule__LengthConversion__Group__1__Impl"
    // InternalUnits.g:854:1: rule__LengthConversion__Group__1__Impl : ( ( rule__LengthConversion__LengthValueAssignment_1 ) ) ;
    public final void rule__LengthConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:858:1: ( ( ( rule__LengthConversion__LengthValueAssignment_1 ) ) )
            // InternalUnits.g:859:1: ( ( rule__LengthConversion__LengthValueAssignment_1 ) )
            {
            // InternalUnits.g:859:1: ( ( rule__LengthConversion__LengthValueAssignment_1 ) )
            // InternalUnits.g:860:2: ( rule__LengthConversion__LengthValueAssignment_1 )
            {
             before(grammarAccess.getLengthConversionAccess().getLengthValueAssignment_1()); 
            // InternalUnits.g:861:2: ( rule__LengthConversion__LengthValueAssignment_1 )
            // InternalUnits.g:861:3: rule__LengthConversion__LengthValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LengthConversion__LengthValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLengthConversionAccess().getLengthValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__1__Impl"


    // $ANTLR start "rule__LengthConversion__Group__2"
    // InternalUnits.g:869:1: rule__LengthConversion__Group__2 : rule__LengthConversion__Group__2__Impl rule__LengthConversion__Group__3 ;
    public final void rule__LengthConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:873:1: ( rule__LengthConversion__Group__2__Impl rule__LengthConversion__Group__3 )
            // InternalUnits.g:874:2: rule__LengthConversion__Group__2__Impl rule__LengthConversion__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__LengthConversion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthConversion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__2"


    // $ANTLR start "rule__LengthConversion__Group__2__Impl"
    // InternalUnits.g:881:1: rule__LengthConversion__Group__2__Impl : ( '(' ) ;
    public final void rule__LengthConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:885:1: ( ( '(' ) )
            // InternalUnits.g:886:1: ( '(' )
            {
            // InternalUnits.g:886:1: ( '(' )
            // InternalUnits.g:887:2: '('
            {
             before(grammarAccess.getLengthConversionAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLengthConversionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__2__Impl"


    // $ANTLR start "rule__LengthConversion__Group__3"
    // InternalUnits.g:896:1: rule__LengthConversion__Group__3 : rule__LengthConversion__Group__3__Impl rule__LengthConversion__Group__4 ;
    public final void rule__LengthConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:900:1: ( rule__LengthConversion__Group__3__Impl rule__LengthConversion__Group__4 )
            // InternalUnits.g:901:2: rule__LengthConversion__Group__3__Impl rule__LengthConversion__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__LengthConversion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthConversion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__3"


    // $ANTLR start "rule__LengthConversion__Group__3__Impl"
    // InternalUnits.g:908:1: rule__LengthConversion__Group__3__Impl : ( ( rule__LengthConversion__InitialLengthAssignment_3 ) ) ;
    public final void rule__LengthConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:912:1: ( ( ( rule__LengthConversion__InitialLengthAssignment_3 ) ) )
            // InternalUnits.g:913:1: ( ( rule__LengthConversion__InitialLengthAssignment_3 ) )
            {
            // InternalUnits.g:913:1: ( ( rule__LengthConversion__InitialLengthAssignment_3 ) )
            // InternalUnits.g:914:2: ( rule__LengthConversion__InitialLengthAssignment_3 )
            {
             before(grammarAccess.getLengthConversionAccess().getInitialLengthAssignment_3()); 
            // InternalUnits.g:915:2: ( rule__LengthConversion__InitialLengthAssignment_3 )
            // InternalUnits.g:915:3: rule__LengthConversion__InitialLengthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LengthConversion__InitialLengthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLengthConversionAccess().getInitialLengthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__3__Impl"


    // $ANTLR start "rule__LengthConversion__Group__4"
    // InternalUnits.g:923:1: rule__LengthConversion__Group__4 : rule__LengthConversion__Group__4__Impl rule__LengthConversion__Group__5 ;
    public final void rule__LengthConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:927:1: ( rule__LengthConversion__Group__4__Impl rule__LengthConversion__Group__5 )
            // InternalUnits.g:928:2: rule__LengthConversion__Group__4__Impl rule__LengthConversion__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__LengthConversion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthConversion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__4"


    // $ANTLR start "rule__LengthConversion__Group__4__Impl"
    // InternalUnits.g:935:1: rule__LengthConversion__Group__4__Impl : ( ')' ) ;
    public final void rule__LengthConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:939:1: ( ( ')' ) )
            // InternalUnits.g:940:1: ( ')' )
            {
            // InternalUnits.g:940:1: ( ')' )
            // InternalUnits.g:941:2: ')'
            {
             before(grammarAccess.getLengthConversionAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLengthConversionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__4__Impl"


    // $ANTLR start "rule__LengthConversion__Group__5"
    // InternalUnits.g:950:1: rule__LengthConversion__Group__5 : rule__LengthConversion__Group__5__Impl rule__LengthConversion__Group__6 ;
    public final void rule__LengthConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:954:1: ( rule__LengthConversion__Group__5__Impl rule__LengthConversion__Group__6 )
            // InternalUnits.g:955:2: rule__LengthConversion__Group__5__Impl rule__LengthConversion__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__LengthConversion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LengthConversion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__5"


    // $ANTLR start "rule__LengthConversion__Group__5__Impl"
    // InternalUnits.g:962:1: rule__LengthConversion__Group__5__Impl : ( 'to' ) ;
    public final void rule__LengthConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:966:1: ( ( 'to' ) )
            // InternalUnits.g:967:1: ( 'to' )
            {
            // InternalUnits.g:967:1: ( 'to' )
            // InternalUnits.g:968:2: 'to'
            {
             before(grammarAccess.getLengthConversionAccess().getToKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLengthConversionAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__5__Impl"


    // $ANTLR start "rule__LengthConversion__Group__6"
    // InternalUnits.g:977:1: rule__LengthConversion__Group__6 : rule__LengthConversion__Group__6__Impl ;
    public final void rule__LengthConversion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:981:1: ( rule__LengthConversion__Group__6__Impl )
            // InternalUnits.g:982:2: rule__LengthConversion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LengthConversion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__6"


    // $ANTLR start "rule__LengthConversion__Group__6__Impl"
    // InternalUnits.g:988:1: rule__LengthConversion__Group__6__Impl : ( ( rule__LengthConversion__ConvertedLengthAssignment_6 ) ) ;
    public final void rule__LengthConversion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:992:1: ( ( ( rule__LengthConversion__ConvertedLengthAssignment_6 ) ) )
            // InternalUnits.g:993:1: ( ( rule__LengthConversion__ConvertedLengthAssignment_6 ) )
            {
            // InternalUnits.g:993:1: ( ( rule__LengthConversion__ConvertedLengthAssignment_6 ) )
            // InternalUnits.g:994:2: ( rule__LengthConversion__ConvertedLengthAssignment_6 )
            {
             before(grammarAccess.getLengthConversionAccess().getConvertedLengthAssignment_6()); 
            // InternalUnits.g:995:2: ( rule__LengthConversion__ConvertedLengthAssignment_6 )
            // InternalUnits.g:995:3: rule__LengthConversion__ConvertedLengthAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LengthConversion__ConvertedLengthAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLengthConversionAccess().getConvertedLengthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__Group__6__Impl"


    // $ANTLR start "rule__TimeConversion__Group__0"
    // InternalUnits.g:1004:1: rule__TimeConversion__Group__0 : rule__TimeConversion__Group__0__Impl rule__TimeConversion__Group__1 ;
    public final void rule__TimeConversion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1008:1: ( rule__TimeConversion__Group__0__Impl rule__TimeConversion__Group__1 )
            // InternalUnits.g:1009:2: rule__TimeConversion__Group__0__Impl rule__TimeConversion__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TimeConversion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConversion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__0"


    // $ANTLR start "rule__TimeConversion__Group__0__Impl"
    // InternalUnits.g:1016:1: rule__TimeConversion__Group__0__Impl : ( 'convert' ) ;
    public final void rule__TimeConversion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1020:1: ( ( 'convert' ) )
            // InternalUnits.g:1021:1: ( 'convert' )
            {
            // InternalUnits.g:1021:1: ( 'convert' )
            // InternalUnits.g:1022:2: 'convert'
            {
             before(grammarAccess.getTimeConversionAccess().getConvertKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTimeConversionAccess().getConvertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__0__Impl"


    // $ANTLR start "rule__TimeConversion__Group__1"
    // InternalUnits.g:1031:1: rule__TimeConversion__Group__1 : rule__TimeConversion__Group__1__Impl rule__TimeConversion__Group__2 ;
    public final void rule__TimeConversion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1035:1: ( rule__TimeConversion__Group__1__Impl rule__TimeConversion__Group__2 )
            // InternalUnits.g:1036:2: rule__TimeConversion__Group__1__Impl rule__TimeConversion__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TimeConversion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConversion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__1"


    // $ANTLR start "rule__TimeConversion__Group__1__Impl"
    // InternalUnits.g:1043:1: rule__TimeConversion__Group__1__Impl : ( ( rule__TimeConversion__TimeAssignment_1 ) ) ;
    public final void rule__TimeConversion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1047:1: ( ( ( rule__TimeConversion__TimeAssignment_1 ) ) )
            // InternalUnits.g:1048:1: ( ( rule__TimeConversion__TimeAssignment_1 ) )
            {
            // InternalUnits.g:1048:1: ( ( rule__TimeConversion__TimeAssignment_1 ) )
            // InternalUnits.g:1049:2: ( rule__TimeConversion__TimeAssignment_1 )
            {
             before(grammarAccess.getTimeConversionAccess().getTimeAssignment_1()); 
            // InternalUnits.g:1050:2: ( rule__TimeConversion__TimeAssignment_1 )
            // InternalUnits.g:1050:3: rule__TimeConversion__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeConversion__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeConversionAccess().getTimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__1__Impl"


    // $ANTLR start "rule__TimeConversion__Group__2"
    // InternalUnits.g:1058:1: rule__TimeConversion__Group__2 : rule__TimeConversion__Group__2__Impl rule__TimeConversion__Group__3 ;
    public final void rule__TimeConversion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1062:1: ( rule__TimeConversion__Group__2__Impl rule__TimeConversion__Group__3 )
            // InternalUnits.g:1063:2: rule__TimeConversion__Group__2__Impl rule__TimeConversion__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TimeConversion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConversion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__2"


    // $ANTLR start "rule__TimeConversion__Group__2__Impl"
    // InternalUnits.g:1070:1: rule__TimeConversion__Group__2__Impl : ( '(' ) ;
    public final void rule__TimeConversion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1074:1: ( ( '(' ) )
            // InternalUnits.g:1075:1: ( '(' )
            {
            // InternalUnits.g:1075:1: ( '(' )
            // InternalUnits.g:1076:2: '('
            {
             before(grammarAccess.getTimeConversionAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTimeConversionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__2__Impl"


    // $ANTLR start "rule__TimeConversion__Group__3"
    // InternalUnits.g:1085:1: rule__TimeConversion__Group__3 : rule__TimeConversion__Group__3__Impl rule__TimeConversion__Group__4 ;
    public final void rule__TimeConversion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1089:1: ( rule__TimeConversion__Group__3__Impl rule__TimeConversion__Group__4 )
            // InternalUnits.g:1090:2: rule__TimeConversion__Group__3__Impl rule__TimeConversion__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__TimeConversion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConversion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__3"


    // $ANTLR start "rule__TimeConversion__Group__3__Impl"
    // InternalUnits.g:1097:1: rule__TimeConversion__Group__3__Impl : ( ( rule__TimeConversion__InitialTimeAssignment_3 ) ) ;
    public final void rule__TimeConversion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1101:1: ( ( ( rule__TimeConversion__InitialTimeAssignment_3 ) ) )
            // InternalUnits.g:1102:1: ( ( rule__TimeConversion__InitialTimeAssignment_3 ) )
            {
            // InternalUnits.g:1102:1: ( ( rule__TimeConversion__InitialTimeAssignment_3 ) )
            // InternalUnits.g:1103:2: ( rule__TimeConversion__InitialTimeAssignment_3 )
            {
             before(grammarAccess.getTimeConversionAccess().getInitialTimeAssignment_3()); 
            // InternalUnits.g:1104:2: ( rule__TimeConversion__InitialTimeAssignment_3 )
            // InternalUnits.g:1104:3: rule__TimeConversion__InitialTimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TimeConversion__InitialTimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimeConversionAccess().getInitialTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__3__Impl"


    // $ANTLR start "rule__TimeConversion__Group__4"
    // InternalUnits.g:1112:1: rule__TimeConversion__Group__4 : rule__TimeConversion__Group__4__Impl rule__TimeConversion__Group__5 ;
    public final void rule__TimeConversion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1116:1: ( rule__TimeConversion__Group__4__Impl rule__TimeConversion__Group__5 )
            // InternalUnits.g:1117:2: rule__TimeConversion__Group__4__Impl rule__TimeConversion__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__TimeConversion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConversion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__4"


    // $ANTLR start "rule__TimeConversion__Group__4__Impl"
    // InternalUnits.g:1124:1: rule__TimeConversion__Group__4__Impl : ( ')' ) ;
    public final void rule__TimeConversion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1128:1: ( ( ')' ) )
            // InternalUnits.g:1129:1: ( ')' )
            {
            // InternalUnits.g:1129:1: ( ')' )
            // InternalUnits.g:1130:2: ')'
            {
             before(grammarAccess.getTimeConversionAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTimeConversionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__4__Impl"


    // $ANTLR start "rule__TimeConversion__Group__5"
    // InternalUnits.g:1139:1: rule__TimeConversion__Group__5 : rule__TimeConversion__Group__5__Impl rule__TimeConversion__Group__6 ;
    public final void rule__TimeConversion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1143:1: ( rule__TimeConversion__Group__5__Impl rule__TimeConversion__Group__6 )
            // InternalUnits.g:1144:2: rule__TimeConversion__Group__5__Impl rule__TimeConversion__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__TimeConversion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeConversion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__5"


    // $ANTLR start "rule__TimeConversion__Group__5__Impl"
    // InternalUnits.g:1151:1: rule__TimeConversion__Group__5__Impl : ( 'to' ) ;
    public final void rule__TimeConversion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1155:1: ( ( 'to' ) )
            // InternalUnits.g:1156:1: ( 'to' )
            {
            // InternalUnits.g:1156:1: ( 'to' )
            // InternalUnits.g:1157:2: 'to'
            {
             before(grammarAccess.getTimeConversionAccess().getToKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTimeConversionAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__5__Impl"


    // $ANTLR start "rule__TimeConversion__Group__6"
    // InternalUnits.g:1166:1: rule__TimeConversion__Group__6 : rule__TimeConversion__Group__6__Impl ;
    public final void rule__TimeConversion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1170:1: ( rule__TimeConversion__Group__6__Impl )
            // InternalUnits.g:1171:2: rule__TimeConversion__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeConversion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__6"


    // $ANTLR start "rule__TimeConversion__Group__6__Impl"
    // InternalUnits.g:1177:1: rule__TimeConversion__Group__6__Impl : ( ( rule__TimeConversion__ConvertedTimeAssignment_6 ) ) ;
    public final void rule__TimeConversion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1181:1: ( ( ( rule__TimeConversion__ConvertedTimeAssignment_6 ) ) )
            // InternalUnits.g:1182:1: ( ( rule__TimeConversion__ConvertedTimeAssignment_6 ) )
            {
            // InternalUnits.g:1182:1: ( ( rule__TimeConversion__ConvertedTimeAssignment_6 ) )
            // InternalUnits.g:1183:2: ( rule__TimeConversion__ConvertedTimeAssignment_6 )
            {
             before(grammarAccess.getTimeConversionAccess().getConvertedTimeAssignment_6()); 
            // InternalUnits.g:1184:2: ( rule__TimeConversion__ConvertedTimeAssignment_6 )
            // InternalUnits.g:1184:3: rule__TimeConversion__ConvertedTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TimeConversion__ConvertedTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTimeConversionAccess().getConvertedTimeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__Group__6__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalUnits.g:1193:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1197:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalUnits.g:1198:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalUnits.g:1205:1: rule__REAL__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1209:1: ( ( ( RULE_INT )? ) )
            // InternalUnits.g:1210:1: ( ( RULE_INT )? )
            {
            // InternalUnits.g:1210:1: ( ( RULE_INT )? )
            // InternalUnits.g:1211:2: ( RULE_INT )?
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            // InternalUnits.g:1212:2: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUnits.g:1212:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalUnits.g:1220:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1224:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalUnits.g:1225:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalUnits.g:1232:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1236:1: ( ( '.' ) )
            // InternalUnits.g:1237:1: ( '.' )
            {
            // InternalUnits.g:1237:1: ( '.' )
            // InternalUnits.g:1238:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalUnits.g:1247:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1251:1: ( rule__REAL__Group__2__Impl )
            // InternalUnits.g:1252:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalUnits.g:1258:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1262:1: ( ( RULE_INT ) )
            // InternalUnits.g:1263:1: ( RULE_INT )
            {
            // InternalUnits.g:1263:1: ( RULE_INT )
            // InternalUnits.g:1264:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__Units__StatementAssignment"
    // InternalUnits.g:1274:1: rule__Units__StatementAssignment : ( ruleStatements ) ;
    public final void rule__Units__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1278:1: ( ( ruleStatements ) )
            // InternalUnits.g:1279:2: ( ruleStatements )
            {
            // InternalUnits.g:1279:2: ( ruleStatements )
            // InternalUnits.g:1280:3: ruleStatements
            {
             before(grammarAccess.getUnitsAccess().getStatementStatementsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getUnitsAccess().getStatementStatementsParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Units__StatementAssignment"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalUnits.g:1289:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1293:1: ( ( RULE_ID ) )
            // InternalUnits.g:1294:2: ( RULE_ID )
            {
            // InternalUnits.g:1294:2: ( RULE_ID )
            // InternalUnits.g:1295:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalUnits.g:1304:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1308:1: ( ( RULE_INT ) )
            // InternalUnits.g:1309:2: ( RULE_INT )
            {
            // InternalUnits.g:1309:2: ( RULE_INT )
            // InternalUnits.g:1310:3: RULE_INT
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__MassConversion__MassValueAssignment_1"
    // InternalUnits.g:1319:1: rule__MassConversion__MassValueAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__MassConversion__MassValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1323:1: ( ( ruleIntExpression ) )
            // InternalUnits.g:1324:2: ( ruleIntExpression )
            {
            // InternalUnits.g:1324:2: ( ruleIntExpression )
            // InternalUnits.g:1325:3: ruleIntExpression
            {
             before(grammarAccess.getMassConversionAccess().getMassValueIntExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;

             after(grammarAccess.getMassConversionAccess().getMassValueIntExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__MassValueAssignment_1"


    // $ANTLR start "rule__MassConversion__InitialMassValueAssignment_3"
    // InternalUnits.g:1334:1: rule__MassConversion__InitialMassValueAssignment_3 : ( ruleMassUnits ) ;
    public final void rule__MassConversion__InitialMassValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1338:1: ( ( ruleMassUnits ) )
            // InternalUnits.g:1339:2: ( ruleMassUnits )
            {
            // InternalUnits.g:1339:2: ( ruleMassUnits )
            // InternalUnits.g:1340:3: ruleMassUnits
            {
             before(grammarAccess.getMassConversionAccess().getInitialMassValueMassUnitsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMassUnits();

            state._fsp--;

             after(grammarAccess.getMassConversionAccess().getInitialMassValueMassUnitsEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__InitialMassValueAssignment_3"


    // $ANTLR start "rule__MassConversion__ConvertedMassValueAssignment_6"
    // InternalUnits.g:1349:1: rule__MassConversion__ConvertedMassValueAssignment_6 : ( ruleMassUnits ) ;
    public final void rule__MassConversion__ConvertedMassValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1353:1: ( ( ruleMassUnits ) )
            // InternalUnits.g:1354:2: ( ruleMassUnits )
            {
            // InternalUnits.g:1354:2: ( ruleMassUnits )
            // InternalUnits.g:1355:3: ruleMassUnits
            {
             before(grammarAccess.getMassConversionAccess().getConvertedMassValueMassUnitsEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMassUnits();

            state._fsp--;

             after(grammarAccess.getMassConversionAccess().getConvertedMassValueMassUnitsEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MassConversion__ConvertedMassValueAssignment_6"


    // $ANTLR start "rule__LengthConversion__LengthValueAssignment_1"
    // InternalUnits.g:1364:1: rule__LengthConversion__LengthValueAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__LengthConversion__LengthValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1368:1: ( ( ruleIntExpression ) )
            // InternalUnits.g:1369:2: ( ruleIntExpression )
            {
            // InternalUnits.g:1369:2: ( ruleIntExpression )
            // InternalUnits.g:1370:3: ruleIntExpression
            {
             before(grammarAccess.getLengthConversionAccess().getLengthValueIntExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;

             after(grammarAccess.getLengthConversionAccess().getLengthValueIntExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__LengthValueAssignment_1"


    // $ANTLR start "rule__LengthConversion__InitialLengthAssignment_3"
    // InternalUnits.g:1379:1: rule__LengthConversion__InitialLengthAssignment_3 : ( ruleLengthUnits ) ;
    public final void rule__LengthConversion__InitialLengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1383:1: ( ( ruleLengthUnits ) )
            // InternalUnits.g:1384:2: ( ruleLengthUnits )
            {
            // InternalUnits.g:1384:2: ( ruleLengthUnits )
            // InternalUnits.g:1385:3: ruleLengthUnits
            {
             before(grammarAccess.getLengthConversionAccess().getInitialLengthLengthUnitsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLengthUnits();

            state._fsp--;

             after(grammarAccess.getLengthConversionAccess().getInitialLengthLengthUnitsEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__InitialLengthAssignment_3"


    // $ANTLR start "rule__LengthConversion__ConvertedLengthAssignment_6"
    // InternalUnits.g:1394:1: rule__LengthConversion__ConvertedLengthAssignment_6 : ( ruleLengthUnits ) ;
    public final void rule__LengthConversion__ConvertedLengthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1398:1: ( ( ruleLengthUnits ) )
            // InternalUnits.g:1399:2: ( ruleLengthUnits )
            {
            // InternalUnits.g:1399:2: ( ruleLengthUnits )
            // InternalUnits.g:1400:3: ruleLengthUnits
            {
             before(grammarAccess.getLengthConversionAccess().getConvertedLengthLengthUnitsEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLengthUnits();

            state._fsp--;

             after(grammarAccess.getLengthConversionAccess().getConvertedLengthLengthUnitsEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LengthConversion__ConvertedLengthAssignment_6"


    // $ANTLR start "rule__TimeConversion__TimeAssignment_1"
    // InternalUnits.g:1409:1: rule__TimeConversion__TimeAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__TimeConversion__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1413:1: ( ( ruleIntExpression ) )
            // InternalUnits.g:1414:2: ( ruleIntExpression )
            {
            // InternalUnits.g:1414:2: ( ruleIntExpression )
            // InternalUnits.g:1415:3: ruleIntExpression
            {
             before(grammarAccess.getTimeConversionAccess().getTimeIntExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;

             after(grammarAccess.getTimeConversionAccess().getTimeIntExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__TimeAssignment_1"


    // $ANTLR start "rule__TimeConversion__InitialTimeAssignment_3"
    // InternalUnits.g:1424:1: rule__TimeConversion__InitialTimeAssignment_3 : ( ruleTimeUnits ) ;
    public final void rule__TimeConversion__InitialTimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1428:1: ( ( ruleTimeUnits ) )
            // InternalUnits.g:1429:2: ( ruleTimeUnits )
            {
            // InternalUnits.g:1429:2: ( ruleTimeUnits )
            // InternalUnits.g:1430:3: ruleTimeUnits
            {
             before(grammarAccess.getTimeConversionAccess().getInitialTimeTimeUnitsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnits();

            state._fsp--;

             after(grammarAccess.getTimeConversionAccess().getInitialTimeTimeUnitsEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__InitialTimeAssignment_3"


    // $ANTLR start "rule__TimeConversion__ConvertedTimeAssignment_6"
    // InternalUnits.g:1439:1: rule__TimeConversion__ConvertedTimeAssignment_6 : ( ruleTimeUnits ) ;
    public final void rule__TimeConversion__ConvertedTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1443:1: ( ( ruleTimeUnits ) )
            // InternalUnits.g:1444:2: ( ruleTimeUnits )
            {
            // InternalUnits.g:1444:2: ( ruleTimeUnits )
            // InternalUnits.g:1445:3: ruleTimeUnits
            {
             before(grammarAccess.getTimeConversionAccess().getConvertedTimeTimeUnitsEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnits();

            state._fsp--;

             after(grammarAccess.getTimeConversionAccess().getConvertedTimeTimeUnitsEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConversion__ConvertedTimeAssignment_6"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalUnits.g:1454:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1458:1: ( ( RULE_INT ) )
            // InternalUnits.g:1459:2: ( RULE_INT )
            {
            // InternalUnits.g:1459:2: ( RULE_INT )
            // InternalUnits.g:1460:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__RealLiteral__ValAssignment"
    // InternalUnits.g:1469:1: rule__RealLiteral__ValAssignment : ( ruleREAL ) ;
    public final void rule__RealLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1473:1: ( ( ruleREAL ) )
            // InternalUnits.g:1474:2: ( ruleREAL )
            {
            // InternalUnits.g:1474:2: ( ruleREAL )
            // InternalUnits.g:1475:3: ruleREAL
            {
             before(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__ValAssignment"


    // $ANTLR start "rule__IntVarExpression__VarAssignment"
    // InternalUnits.g:1484:1: rule__IntVarExpression__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__IntVarExpression__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnits.g:1488:1: ( ( ( RULE_ID ) ) )
            // InternalUnits.g:1489:2: ( ( RULE_ID ) )
            {
            // InternalUnits.g:1489:2: ( ( RULE_ID ) )
            // InternalUnits.g:1490:3: ( RULE_ID )
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalUnits.g:1491:3: ( RULE_ID )
            // InternalUnits.g:1492:4: RULE_ID
            {
             before(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getIntVarExpressionAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntVarExpression__VarAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\22\1\4\1\uffff\2\25\1\4\1\13\1\25\2\uffff\1\26\1\uffff\1\27\1\15\1\uffff";
    static final String dfa_3s = "\1\24\1\30\1\uffff\1\30\1\25\1\4\1\21\1\25\2\uffff\1\26\1\uffff\1\27\1\21\1\uffff";
    static final String dfa_4s = "\2\uffff\1\4\5\uffff\1\1\1\3\1\uffff\1\2\2\uffff\1\2";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\uffff\1\1",
            "\1\3\1\4\22\uffff\1\5",
            "",
            "\1\6\2\uffff\1\5",
            "\1\6",
            "\1\7",
            "\2\10\1\11\1\12\1\11\2\13",
            "\1\6",
            "",
            "",
            "\1\14",
            "",
            "\1\15",
            "\1\11\1\16\1\11\2\16",
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
            return "383:1: rule__Statements__Alternatives : ( ( ruleMassConversion ) | ( ruleLengthConversion ) | ( ruleTimeConversion ) | ( ruleVariableDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000E000L});

}