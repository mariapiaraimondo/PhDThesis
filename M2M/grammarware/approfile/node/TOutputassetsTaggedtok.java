/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class TOutputassetsTaggedtok extends Token
{
    public TOutputassetsTaggedtok()
    {
        super.setText("outputAssets");
    }

    public TOutputassetsTaggedtok(int line, int pos)
    {
        super.setText("outputAssets");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOutputassetsTaggedtok(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOutputassetsTaggedtok(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOutputassetsTaggedtok text.");
    }
}
