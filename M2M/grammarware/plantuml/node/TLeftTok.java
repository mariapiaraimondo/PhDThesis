/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class TLeftTok extends Token
{
    public TLeftTok()
    {
        super.setText("left");
    }

    public TLeftTok(int line, int pos)
    {
        super.setText("left");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLeftTok(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLeftTok(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLeftTok text.");
    }
}
