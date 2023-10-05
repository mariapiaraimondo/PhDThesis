/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.analysis;

import protocol.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseADataDataCondition(ADataDataCondition node);
    void caseAConditionDataCondition(AConditionDataCondition node);
    void caseASimpleDataClause(ASimpleDataClause node);
    void caseAListDataClause(AListDataClause node);
    void caseAListDataExpression(AListDataExpression node);
    void caseASimpleAtomicList(ASimpleAtomicList node);
    void caseAListAtomicList(AListAtomicList node);
    void caseAVariableArgument(AVariableArgument node);
    void caseAFunctionArgument(AFunctionArgument node);
    void caseARecursiveArgument(ARecursiveArgument node);
    void caseAEmptyFunction(AEmptyFunction node);
    void caseAHashFunction(AHashFunction node);
    void caseAIdFunction(AIdFunction node);
    void caseAFreshFunction(AFreshFunction node);
    void caseAPubkeyFunction(APubkeyFunction node);
    void caseASignatureFunction(ASignatureFunction node);
    void caseAPubkeyDataFunction(APubkeyDataFunction node);
    void caseASignatureDataFunction(ASignatureDataFunction node);
    void caseASimpleIdClause(ASimpleIdClause node);
    void caseASimpleFreshClause(ASimpleFreshClause node);
    void caseASimpleHashClause(ASimpleHashClause node);
    void caseASimplePubkeyClause(ASimplePubkeyClause node);
    void caseASimpleSignatureClause(ASimpleSignatureClause node);
    void caseASecretConditionClause(ASecretConditionClause node);
    void caseAWauthConditionClause(AWauthConditionClause node);
    void caseASimpleSecretClause(ASimpleSecretClause node);
    void caseASimpleWeakauthClause(ASimpleWeakauthClause node);
    void caseASimpleSecretPeer(ASimpleSecretPeer node);
    void caseASimpleWeakActor(ASimpleWeakActor node);
    void caseASimpleWeakSubject(ASimpleWeakSubject node);
    void caseASimpleNumber(ASimpleNumber node);
    void caseASimpleName(ASimpleName node);

    void caseTComma(TComma node);
    void caseTOpenRound(TOpenRound node);
    void caseTCloseRound(TCloseRound node);
    void caseTOpenSquare(TOpenSquare node);
    void caseTCloseSquare(TCloseSquare node);
    void caseTOpenCurly(TOpenCurly node);
    void caseTCloseCurly(TCloseCurly node);
    void caseTFreshTok(TFreshTok node);
    void caseTIdTok(TIdTok node);
    void caseTEmptyTok(TEmptyTok node);
    void caseTPubkeyTok(TPubkeyTok node);
    void caseTHashTok(THashTok node);
    void caseTSignatureTok(TSignatureTok node);
    void caseTWeakauthTok(TWeakauthTok node);
    void caseTSecretTok(TSecretTok node);
    void caseTDigitSeq(TDigitSeq node);
    void caseTCharSeq(TCharSeq node);
    void caseTIgn(TIgn node);
    void caseTNewLine(TNewLine node);
    void caseTBlank(TBlank node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
