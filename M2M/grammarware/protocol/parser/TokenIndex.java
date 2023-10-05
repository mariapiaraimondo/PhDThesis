/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.parser;

import protocol.node.*;
import protocol.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 0;
    }

    @Override
    public void caseTOpenRound(@SuppressWarnings("unused") TOpenRound node)
    {
        this.index = 1;
    }

    @Override
    public void caseTCloseRound(@SuppressWarnings("unused") TCloseRound node)
    {
        this.index = 2;
    }

    @Override
    public void caseTOpenSquare(@SuppressWarnings("unused") TOpenSquare node)
    {
        this.index = 3;
    }

    @Override
    public void caseTCloseSquare(@SuppressWarnings("unused") TCloseSquare node)
    {
        this.index = 4;
    }

    @Override
    public void caseTOpenCurly(@SuppressWarnings("unused") TOpenCurly node)
    {
        this.index = 5;
    }

    @Override
    public void caseTCloseCurly(@SuppressWarnings("unused") TCloseCurly node)
    {
        this.index = 6;
    }

    @Override
    public void caseTFreshTok(@SuppressWarnings("unused") TFreshTok node)
    {
        this.index = 7;
    }

    @Override
    public void caseTIdTok(@SuppressWarnings("unused") TIdTok node)
    {
        this.index = 8;
    }

    @Override
    public void caseTEmptyTok(@SuppressWarnings("unused") TEmptyTok node)
    {
        this.index = 9;
    }

    @Override
    public void caseTPubkeyTok(@SuppressWarnings("unused") TPubkeyTok node)
    {
        this.index = 10;
    }

    @Override
    public void caseTHashTok(@SuppressWarnings("unused") THashTok node)
    {
        this.index = 11;
    }

    @Override
    public void caseTSignatureTok(@SuppressWarnings("unused") TSignatureTok node)
    {
        this.index = 12;
    }

    @Override
    public void caseTWeakauthTok(@SuppressWarnings("unused") TWeakauthTok node)
    {
        this.index = 13;
    }

    @Override
    public void caseTSecretTok(@SuppressWarnings("unused") TSecretTok node)
    {
        this.index = 14;
    }

    @Override
    public void caseTDigitSeq(@SuppressWarnings("unused") TDigitSeq node)
    {
        this.index = 15;
    }

    @Override
    public void caseTCharSeq(@SuppressWarnings("unused") TCharSeq node)
    {
        this.index = 16;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 17;
    }
}