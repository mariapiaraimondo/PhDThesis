/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.node;

import protocol.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleAtomicList extends PAtomicList
{
    private PArgument _argument_;

    public ASimpleAtomicList()
    {
        // Constructor
    }

    public ASimpleAtomicList(
        @SuppressWarnings("hiding") PArgument _argument_)
    {
        // Constructor
        setArgument(_argument_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleAtomicList(
            cloneNode(this._argument_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleAtomicList(this);
    }

    public PArgument getArgument()
    {
        return this._argument_;
    }

    public void setArgument(PArgument node)
    {
        if(this._argument_ != null)
        {
            this._argument_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._argument_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._argument_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._argument_ == child)
        {
            this._argument_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._argument_ == oldChild)
        {
            setArgument((PArgument) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
