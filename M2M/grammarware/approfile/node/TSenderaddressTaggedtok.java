/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class TSenderaddressTaggedtok extends Token
{
    public TSenderaddressTaggedtok()
    {
        super.setText("senderAddress");
    }

    public TSenderaddressTaggedtok(int line, int pos)
    {
        super.setText("senderAddress");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSenderaddressTaggedtok(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSenderaddressTaggedtok(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSenderaddressTaggedtok text.");
    }
}