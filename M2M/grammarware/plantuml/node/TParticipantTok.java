/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class TParticipantTok extends Token
{
    public TParticipantTok()
    {
        super.setText("participant");
    }

    public TParticipantTok(int line, int pos)
    {
        super.setText("participant");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TParticipantTok(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTParticipantTok(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TParticipantTok text.");
    }
}
