/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class TOutputassetStereotype extends Token
{
    public TOutputassetStereotype()
    {
        super.setText("<<OutputAsset>>");
    }

    public TOutputassetStereotype(int line, int pos)
    {
        super.setText("<<OutputAsset>>");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOutputassetStereotype(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOutputassetStereotype(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOutputassetStereotype text.");
    }
}
