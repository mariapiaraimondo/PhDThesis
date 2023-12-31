/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleContent extends PContent
{
    private TOpaqueexpr _opaqueexpr_;

    public ASimpleContent()
    {
        // Constructor
    }

    public ASimpleContent(
        @SuppressWarnings("hiding") TOpaqueexpr _opaqueexpr_)
    {
        // Constructor
        setOpaqueexpr(_opaqueexpr_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleContent(
            cloneNode(this._opaqueexpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleContent(this);
    }

    public TOpaqueexpr getOpaqueexpr()
    {
        return this._opaqueexpr_;
    }

    public void setOpaqueexpr(TOpaqueexpr node)
    {
        if(this._opaqueexpr_ != null)
        {
            this._opaqueexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opaqueexpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._opaqueexpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._opaqueexpr_ == child)
        {
            this._opaqueexpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._opaqueexpr_ == oldChild)
        {
            setOpaqueexpr((TOpaqueexpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
