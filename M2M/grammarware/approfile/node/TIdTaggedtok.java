/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class TIdTaggedtok extends Token
{
    public TIdTaggedtok()
    {
        super.setText("id");
    }

    public TIdTaggedtok(int line, int pos)
    {
        super.setText("id");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIdTaggedtok(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIdTaggedtok(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIdTaggedtok text.");
    }
}
