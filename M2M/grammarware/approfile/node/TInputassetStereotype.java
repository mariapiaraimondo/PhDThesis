/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class TInputassetStereotype extends Token
{
    public TInputassetStereotype()
    {
        super.setText("<<InputAsset>>");
    }

    public TInputassetStereotype(int line, int pos)
    {
        super.setText("<<InputAsset>>");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInputassetStereotype(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInputassetStereotype(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInputassetStereotype text.");
    }
}
