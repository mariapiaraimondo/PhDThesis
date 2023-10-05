/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class TEndTok extends Token
{
    public TEndTok()
    {
        super.setText("end");
    }

    public TEndTok(int line, int pos)
    {
        super.setText("end");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndTok(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndTok(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndTok text.");
    }
}
