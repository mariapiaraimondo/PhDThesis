/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class TRDAng extends Token
{
    public TRDAng()
    {
        super.setText(">>");
    }

    public TRDAng(int line, int pos)
    {
        super.setText(">>");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TRDAng(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRDAng(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TRDAng text.");
    }
}
