/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class TCloseRound extends Token
{
    public TCloseRound()
    {
        super.setText(")");
    }

    public TCloseRound(int line, int pos)
    {
        super.setText(")");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCloseRound(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCloseRound(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCloseRound text.");
    }
}
