/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.group32.units.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class UnitsGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class UnitsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.Units");
		private final Assignment cStatementAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStatementStatementsParserRuleCall_0 = (RuleCall)cStatementAssignment.eContents().get(0);
		
		//Units:
		//	statement+=Statements*;
		@Override public ParserRule getRule() { return rule; }
		
		//statement+=Statements*
		public Assignment getStatementAssignment() { return cStatementAssignment; }
		
		//Statements
		public RuleCall getStatementStatementsParserRuleCall_0() { return cStatementStatementsParserRuleCall_0; }
	}
	public class StatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.Statements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMassConversionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLengthConversionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTimeConversionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cVariableDeclarationParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Statements:
		//	MassConversion | LengthConversion | TimeConversion | VariableDeclaration;
		@Override public ParserRule getRule() { return rule; }
		
		//MassConversion | LengthConversion | TimeConversion | VariableDeclaration
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MassConversion
		public RuleCall getMassConversionParserRuleCall_0() { return cMassConversionParserRuleCall_0; }
		
		//LengthConversion
		public RuleCall getLengthConversionParserRuleCall_1() { return cLengthConversionParserRuleCall_1; }
		
		//TimeConversion
		public RuleCall getTimeConversionParserRuleCall_2() { return cTimeConversionParserRuleCall_2; }
		
		//VariableDeclaration
		public RuleCall getVariableDeclarationParserRuleCall_3() { return cVariableDeclarationParserRuleCall_3; }
	}
	public class VariableDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.VariableDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueINTTerminalRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//VariableDeclaration:
		//	'let' name=ID "=" value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID "=" value=INT
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"="
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//value=INT
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_3_0() { return cValueINTTerminalRuleCall_3_0; }
	}
	public class MassConversionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.MassConversion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConvertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMassValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMassValueIntExpressionParserRuleCall_1_0 = (RuleCall)cMassValueAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitialMassValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInitialMassValueMassUnitsEnumRuleCall_3_0 = (RuleCall)cInitialMassValueAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cConvertedMassValueAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cConvertedMassValueMassUnitsEnumRuleCall_6_0 = (RuleCall)cConvertedMassValueAssignment_6.eContents().get(0);
		
		//MassConversion:
		//	'convert' massValue=IntExpression '(' initialMassValue=MassUnits ')' 'to' convertedMassValue=MassUnits;
		@Override public ParserRule getRule() { return rule; }
		
		//'convert' massValue=IntExpression '(' initialMassValue=MassUnits ')' 'to' convertedMassValue=MassUnits
		public Group getGroup() { return cGroup; }
		
		//'convert'
		public Keyword getConvertKeyword_0() { return cConvertKeyword_0; }
		
		//massValue=IntExpression
		public Assignment getMassValueAssignment_1() { return cMassValueAssignment_1; }
		
		//IntExpression
		public RuleCall getMassValueIntExpressionParserRuleCall_1_0() { return cMassValueIntExpressionParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//initialMassValue=MassUnits
		public Assignment getInitialMassValueAssignment_3() { return cInitialMassValueAssignment_3; }
		
		//MassUnits
		public RuleCall getInitialMassValueMassUnitsEnumRuleCall_3_0() { return cInitialMassValueMassUnitsEnumRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }
		
		//convertedMassValue=MassUnits
		public Assignment getConvertedMassValueAssignment_6() { return cConvertedMassValueAssignment_6; }
		
		//MassUnits
		public RuleCall getConvertedMassValueMassUnitsEnumRuleCall_6_0() { return cConvertedMassValueMassUnitsEnumRuleCall_6_0; }
	}
	public class LengthConversionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.LengthConversion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConvertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLengthValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLengthValueIntExpressionParserRuleCall_1_0 = (RuleCall)cLengthValueAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitialLengthAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInitialLengthLengthUnitsEnumRuleCall_3_0 = (RuleCall)cInitialLengthAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cConvertedLengthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cConvertedLengthLengthUnitsEnumRuleCall_6_0 = (RuleCall)cConvertedLengthAssignment_6.eContents().get(0);
		
		//LengthConversion:
		//	'convert' lengthValue=IntExpression '(' initialLength=LengthUnits ')' 'to' convertedLength=LengthUnits;
		@Override public ParserRule getRule() { return rule; }
		
		//'convert' lengthValue=IntExpression '(' initialLength=LengthUnits ')' 'to' convertedLength=LengthUnits
		public Group getGroup() { return cGroup; }
		
		//'convert'
		public Keyword getConvertKeyword_0() { return cConvertKeyword_0; }
		
		//lengthValue=IntExpression
		public Assignment getLengthValueAssignment_1() { return cLengthValueAssignment_1; }
		
		//IntExpression
		public RuleCall getLengthValueIntExpressionParserRuleCall_1_0() { return cLengthValueIntExpressionParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//initialLength=LengthUnits
		public Assignment getInitialLengthAssignment_3() { return cInitialLengthAssignment_3; }
		
		//LengthUnits
		public RuleCall getInitialLengthLengthUnitsEnumRuleCall_3_0() { return cInitialLengthLengthUnitsEnumRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }
		
		//convertedLength=LengthUnits
		public Assignment getConvertedLengthAssignment_6() { return cConvertedLengthAssignment_6; }
		
		//LengthUnits
		public RuleCall getConvertedLengthLengthUnitsEnumRuleCall_6_0() { return cConvertedLengthLengthUnitsEnumRuleCall_6_0; }
	}
	public class TimeConversionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.TimeConversion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConvertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTimeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTimeIntExpressionParserRuleCall_1_0 = (RuleCall)cTimeAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitialTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInitialTimeTimeUnitsEnumRuleCall_3_0 = (RuleCall)cInitialTimeAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cConvertedTimeAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cConvertedTimeTimeUnitsEnumRuleCall_6_0 = (RuleCall)cConvertedTimeAssignment_6.eContents().get(0);
		
		//TimeConversion:
		//	'convert' time=IntExpression '(' initialTime=TimeUnits ')' 'to' convertedTime=TimeUnits;
		@Override public ParserRule getRule() { return rule; }
		
		//'convert' time=IntExpression '(' initialTime=TimeUnits ')' 'to' convertedTime=TimeUnits
		public Group getGroup() { return cGroup; }
		
		//'convert'
		public Keyword getConvertKeyword_0() { return cConvertKeyword_0; }
		
		//time=IntExpression
		public Assignment getTimeAssignment_1() { return cTimeAssignment_1; }
		
		//IntExpression
		public RuleCall getTimeIntExpressionParserRuleCall_1_0() { return cTimeIntExpressionParserRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//initialTime=TimeUnits
		public Assignment getInitialTimeAssignment_3() { return cInitialTimeAssignment_3; }
		
		//TimeUnits
		public RuleCall getInitialTimeTimeUnitsEnumRuleCall_3_0() { return cInitialTimeTimeUnitsEnumRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }
		
		//convertedTime=TimeUnits
		public Assignment getConvertedTimeAssignment_6() { return cConvertedTimeAssignment_6; }
		
		//TimeUnits
		public RuleCall getConvertedTimeTimeUnitsEnumRuleCall_6_0() { return cConvertedTimeTimeUnitsEnumRuleCall_6_0; }
	}
	public class IntExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.IntExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIntLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntVarExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRealLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//IntExpression:
		//	IntLiteral | IntVarExpression | RealLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//IntLiteral | IntVarExpression | RealLiteral
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//IntLiteral
		public RuleCall getIntLiteralParserRuleCall_0() { return cIntLiteralParserRuleCall_0; }
		
		//IntVarExpression
		public RuleCall getIntVarExpressionParserRuleCall_1() { return cIntVarExpressionParserRuleCall_1; }
		
		//RealLiteral
		public RuleCall getRealLiteralParserRuleCall_2() { return cRealLiteralParserRuleCall_2; }
	}
	public class IntLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.IntLiteral");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValINTTerminalRuleCall_0 = (RuleCall)cValAssignment.eContents().get(0);
		
		//IntLiteral:
		//	val=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//val=INT
		public Assignment getValAssignment() { return cValAssignment; }
		
		//INT
		public RuleCall getValINTTerminalRuleCall_0() { return cValINTTerminalRuleCall_0; }
	}
	public class RealLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.RealLiteral");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValREALParserRuleCall_0 = (RuleCall)cValAssignment.eContents().get(0);
		
		//RealLiteral:
		//	val=REAL;
		@Override public ParserRule getRule() { return rule; }
		
		//val=REAL
		public Assignment getValAssignment() { return cValAssignment; }
		
		//REAL
		public RuleCall getValREALParserRuleCall_0() { return cValREALParserRuleCall_0; }
	}
	public class IntVarExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.IntVarExpression");
		private final Assignment cVarAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cVarVariableDeclarationCrossReference_0 = (CrossReference)cVarAssignment.eContents().get(0);
		private final RuleCall cVarVariableDeclarationIDTerminalRuleCall_0_1 = (RuleCall)cVarVariableDeclarationCrossReference_0.eContents().get(1);
		
		//IntVarExpression:
		//	var=[VariableDeclaration];
		@Override public ParserRule getRule() { return rule; }
		
		//var=[VariableDeclaration]
		public Assignment getVarAssignment() { return cVarAssignment; }
		
		//[VariableDeclaration]
		public CrossReference getVarVariableDeclarationCrossReference_0() { return cVarVariableDeclarationCrossReference_0; }
		
		//ID
		public RuleCall getVarVariableDeclarationIDTerminalRuleCall_0_1() { return cVarVariableDeclarationIDTerminalRuleCall_0_1; }
	}
	public class REALElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.REAL");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//REAL ecore::EFloat hidden():
		//	INT? "." INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT? "." INT
		public Group getGroup() { return cGroup; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	
	public class MassUnitsElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.MassUnits");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cKgEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cKgKgKeyword_0_0 = (Keyword)cKgEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cGEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cGGKeyword_1_0 = (Keyword)cGEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MassUnits:
		//	kg | g;
		public EnumRule getRule() { return rule; }
		
		//kg | g
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//kg
		public EnumLiteralDeclaration getKgEnumLiteralDeclaration_0() { return cKgEnumLiteralDeclaration_0; }
		
		//"kg"
		public Keyword getKgKgKeyword_0_0() { return cKgKgKeyword_0_0; }
		
		//g
		public EnumLiteralDeclaration getGEnumLiteralDeclaration_1() { return cGEnumLiteralDeclaration_1; }
		
		//"g"
		public Keyword getGGKeyword_1_0() { return cGGKeyword_1_0; }
	}
	public class TimeUnitsElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.TimeUnits");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cHrEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cHrHrKeyword_0_0 = (Keyword)cHrEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMMKeyword_1_0 = (Keyword)cMEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSSKeyword_2_0 = (Keyword)cSEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum TimeUnits:
		//	hr | m | s;
		public EnumRule getRule() { return rule; }
		
		//hr | m | s
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//hr
		public EnumLiteralDeclaration getHrEnumLiteralDeclaration_0() { return cHrEnumLiteralDeclaration_0; }
		
		//"hr"
		public Keyword getHrHrKeyword_0_0() { return cHrHrKeyword_0_0; }
		
		//m
		public EnumLiteralDeclaration getMEnumLiteralDeclaration_1() { return cMEnumLiteralDeclaration_1; }
		
		//"m"
		public Keyword getMMKeyword_1_0() { return cMMKeyword_1_0; }
		
		//s
		public EnumLiteralDeclaration getSEnumLiteralDeclaration_2() { return cSEnumLiteralDeclaration_2; }
		
		//"s"
		public Keyword getSSKeyword_2_0() { return cSSKeyword_2_0; }
	}
	public class LengthUnitsElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.group32.units.Units.LengthUnits");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cKmEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cKmKmKeyword_0_0 = (Keyword)cKmEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMMKeyword_1_0 = (Keyword)cMEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCmEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCmCmKeyword_2_0 = (Keyword)cCmEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum LengthUnits:
		//	km | m | cm;
		public EnumRule getRule() { return rule; }
		
		//km | m | cm
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//km
		public EnumLiteralDeclaration getKmEnumLiteralDeclaration_0() { return cKmEnumLiteralDeclaration_0; }
		
		//"km"
		public Keyword getKmKmKeyword_0_0() { return cKmKmKeyword_0_0; }
		
		//m
		public EnumLiteralDeclaration getMEnumLiteralDeclaration_1() { return cMEnumLiteralDeclaration_1; }
		
		//"m"
		public Keyword getMMKeyword_1_0() { return cMMKeyword_1_0; }
		
		//cm
		public EnumLiteralDeclaration getCmEnumLiteralDeclaration_2() { return cCmEnumLiteralDeclaration_2; }
		
		//"cm"
		public Keyword getCmCmKeyword_2_0() { return cCmCmKeyword_2_0; }
	}
	
	private final UnitsElements pUnits;
	private final StatementsElements pStatements;
	private final VariableDeclarationElements pVariableDeclaration;
	private final MassConversionElements pMassConversion;
	private final LengthConversionElements pLengthConversion;
	private final TimeConversionElements pTimeConversion;
	private final MassUnitsElements eMassUnits;
	private final TimeUnitsElements eTimeUnits;
	private final LengthUnitsElements eLengthUnits;
	private final IntExpressionElements pIntExpression;
	private final IntLiteralElements pIntLiteral;
	private final RealLiteralElements pRealLiteral;
	private final IntVarExpressionElements pIntVarExpression;
	private final REALElements pREAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UnitsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pUnits = new UnitsElements();
		this.pStatements = new StatementsElements();
		this.pVariableDeclaration = new VariableDeclarationElements();
		this.pMassConversion = new MassConversionElements();
		this.pLengthConversion = new LengthConversionElements();
		this.pTimeConversion = new TimeConversionElements();
		this.eMassUnits = new MassUnitsElements();
		this.eTimeUnits = new TimeUnitsElements();
		this.eLengthUnits = new LengthUnitsElements();
		this.pIntExpression = new IntExpressionElements();
		this.pIntLiteral = new IntLiteralElements();
		this.pRealLiteral = new RealLiteralElements();
		this.pIntVarExpression = new IntVarExpressionElements();
		this.pREAL = new REALElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.group32.units.Units".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Units:
	//	statement+=Statements*;
	public UnitsElements getUnitsAccess() {
		return pUnits;
	}
	
	public ParserRule getUnitsRule() {
		return getUnitsAccess().getRule();
	}
	
	//Statements:
	//	MassConversion | LengthConversion | TimeConversion | VariableDeclaration;
	public StatementsElements getStatementsAccess() {
		return pStatements;
	}
	
	public ParserRule getStatementsRule() {
		return getStatementsAccess().getRule();
	}
	
	//VariableDeclaration:
	//	'let' name=ID "=" value=INT;
	public VariableDeclarationElements getVariableDeclarationAccess() {
		return pVariableDeclaration;
	}
	
	public ParserRule getVariableDeclarationRule() {
		return getVariableDeclarationAccess().getRule();
	}
	
	//MassConversion:
	//	'convert' massValue=IntExpression '(' initialMassValue=MassUnits ')' 'to' convertedMassValue=MassUnits;
	public MassConversionElements getMassConversionAccess() {
		return pMassConversion;
	}
	
	public ParserRule getMassConversionRule() {
		return getMassConversionAccess().getRule();
	}
	
	//LengthConversion:
	//	'convert' lengthValue=IntExpression '(' initialLength=LengthUnits ')' 'to' convertedLength=LengthUnits;
	public LengthConversionElements getLengthConversionAccess() {
		return pLengthConversion;
	}
	
	public ParserRule getLengthConversionRule() {
		return getLengthConversionAccess().getRule();
	}
	
	//TimeConversion:
	//	'convert' time=IntExpression '(' initialTime=TimeUnits ')' 'to' convertedTime=TimeUnits;
	public TimeConversionElements getTimeConversionAccess() {
		return pTimeConversion;
	}
	
	public ParserRule getTimeConversionRule() {
		return getTimeConversionAccess().getRule();
	}
	
	//enum MassUnits:
	//	kg | g;
	public MassUnitsElements getMassUnitsAccess() {
		return eMassUnits;
	}
	
	public EnumRule getMassUnitsRule() {
		return getMassUnitsAccess().getRule();
	}
	
	//enum TimeUnits:
	//	hr | m | s;
	public TimeUnitsElements getTimeUnitsAccess() {
		return eTimeUnits;
	}
	
	public EnumRule getTimeUnitsRule() {
		return getTimeUnitsAccess().getRule();
	}
	
	//enum LengthUnits:
	//	km | m | cm;
	public LengthUnitsElements getLengthUnitsAccess() {
		return eLengthUnits;
	}
	
	public EnumRule getLengthUnitsRule() {
		return getLengthUnitsAccess().getRule();
	}
	
	//IntExpression:
	//	IntLiteral | IntVarExpression | RealLiteral;
	public IntExpressionElements getIntExpressionAccess() {
		return pIntExpression;
	}
	
	public ParserRule getIntExpressionRule() {
		return getIntExpressionAccess().getRule();
	}
	
	//IntLiteral:
	//	val=INT;
	public IntLiteralElements getIntLiteralAccess() {
		return pIntLiteral;
	}
	
	public ParserRule getIntLiteralRule() {
		return getIntLiteralAccess().getRule();
	}
	
	//RealLiteral:
	//	val=REAL;
	public RealLiteralElements getRealLiteralAccess() {
		return pRealLiteral;
	}
	
	public ParserRule getRealLiteralRule() {
		return getRealLiteralAccess().getRule();
	}
	
	//IntVarExpression:
	//	var=[VariableDeclaration];
	public IntVarExpressionElements getIntVarExpressionAccess() {
		return pIntVarExpression;
	}
	
	public ParserRule getIntVarExpressionRule() {
		return getIntVarExpressionAccess().getRule();
	}
	
	//REAL ecore::EFloat hidden():
	//	INT? "." INT;
	public REALElements getREALAccess() {
		return pREAL;
	}
	
	public ParserRule getREALRule() {
		return getREALAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}