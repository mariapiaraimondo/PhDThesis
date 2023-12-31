/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.parser;

import approfile.node.*;
import approfile.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 0;
    }

    @Override
    public void caseTEquals(@SuppressWarnings("unused") TEquals node)
    {
        this.index = 1;
    }

    @Override
    public void caseTOpenRound(@SuppressWarnings("unused") TOpenRound node)
    {
        this.index = 2;
    }

    @Override
    public void caseTCloseRound(@SuppressWarnings("unused") TCloseRound node)
    {
        this.index = 3;
    }

    @Override
    public void caseTOpenCurly(@SuppressWarnings("unused") TOpenCurly node)
    {
        this.index = 4;
    }

    @Override
    public void caseTCloseCurly(@SuppressWarnings("unused") TCloseCurly node)
    {
        this.index = 5;
    }

    @Override
    public void caseTParticipantStereotype(@SuppressWarnings("unused") TParticipantStereotype node)
    {
        this.index = 6;
    }

    @Override
    public void caseTInputassetStereotype(@SuppressWarnings("unused") TInputassetStereotype node)
    {
        this.index = 7;
    }

    @Override
    public void caseTOutputassetStereotype(@SuppressWarnings("unused") TOutputassetStereotype node)
    {
        this.index = 8;
    }

    @Override
    public void caseTIdTaggedtok(@SuppressWarnings("unused") TIdTaggedtok node)
    {
        this.index = 9;
    }

    @Override
    public void caseTSenderpubkeyTaggedtok(@SuppressWarnings("unused") TSenderpubkeyTaggedtok node)
    {
        this.index = 10;
    }

    @Override
    public void caseTSenderaddressTaggedtok(@SuppressWarnings("unused") TSenderaddressTaggedtok node)
    {
        this.index = 11;
    }

    @Override
    public void caseTDigitalsignatureTaggedtok(@SuppressWarnings("unused") TDigitalsignatureTaggedtok node)
    {
        this.index = 12;
    }

    @Override
    public void caseTTransactionTaggedtok(@SuppressWarnings("unused") TTransactionTaggedtok node)
    {
        this.index = 13;
    }

    @Override
    public void caseTInputassetsTaggedtok(@SuppressWarnings("unused") TInputassetsTaggedtok node)
    {
        this.index = 14;
    }

    @Override
    public void caseTOutputassetsTaggedtok(@SuppressWarnings("unused") TOutputassetsTaggedtok node)
    {
        this.index = 15;
    }

    @Override
    public void caseTDataTaggedtok(@SuppressWarnings("unused") TDataTaggedtok node)
    {
        this.index = 16;
    }

    @Override
    public void caseTReceiverTaggedtok(@SuppressWarnings("unused") TReceiverTaggedtok node)
    {
        this.index = 17;
    }

    @Override
    public void caseTProvenanceTaggedtok(@SuppressWarnings("unused") TProvenanceTaggedtok node)
    {
        this.index = 18;
    }

    @Override
    public void caseTConditionTaggedtok(@SuppressWarnings("unused") TConditionTaggedtok node)
    {
        this.index = 19;
    }

    @Override
    public void caseTFreshTok(@SuppressWarnings("unused") TFreshTok node)
    {
        this.index = 20;
    }

    @Override
    public void caseTAuthenticTok(@SuppressWarnings("unused") TAuthenticTok node)
    {
        this.index = 21;
    }

    @Override
    public void caseTConfidentialTok(@SuppressWarnings("unused") TConfidentialTok node)
    {
        this.index = 22;
    }

    @Override
    public void caseTCharSeq(@SuppressWarnings("unused") TCharSeq node)
    {
        this.index = 23;
    }

    @Override
    public void caseTOpaqueexpr(@SuppressWarnings("unused") TOpaqueexpr node)
    {
        this.index = 24;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 25;
    }
}
