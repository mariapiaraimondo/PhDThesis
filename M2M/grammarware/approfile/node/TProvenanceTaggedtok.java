/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class TProvenanceTaggedtok extends Token
{
    public TProvenanceTaggedtok()
    {
        super.setText("provenance");
    }

    public TProvenanceTaggedtok(int line, int pos)
    {
        super.setText("provenance");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TProvenanceTaggedtok(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTProvenanceTaggedtok(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TProvenanceTaggedtok text.");
    }
}
