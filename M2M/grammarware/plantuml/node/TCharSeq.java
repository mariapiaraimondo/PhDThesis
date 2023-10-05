/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class TCharSeq extends Token
{
    public TCharSeq(String text)
    {
        setText(text);
    }

    public TCharSeq(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCharSeq(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCharSeq(this);
    }
}