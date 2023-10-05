/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class TCloseCurly extends Token
{
    public TCloseCurly()
    {
        super.setText("}");
    }

    public TCloseCurly(int line, int pos)
    {
        super.setText("}");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCloseCurly(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCloseCurly(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCloseCurly text.");
    }
}
