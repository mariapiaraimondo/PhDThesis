/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.node;

import protocol.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyFunction extends PFunction
{
    private TEmptyTok _emptyTok_;

    public AEmptyFunction()
    {
        // Constructor
    }

    public AEmptyFunction(
        @SuppressWarnings("hiding") TEmptyTok _emptyTok_)
    {
        // Constructor
        setEmptyTok(_emptyTok_);

    }

    @Override
    public Object clone()
    {
        return new AEmptyFunction(
            cloneNode(this._emptyTok_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyFunction(this);
    }

    public TEmptyTok getEmptyTok()
    {
        return this._emptyTok_;
    }

    public void setEmptyTok(TEmptyTok node)
    {
        if(this._emptyTok_ != null)
        {
            this._emptyTok_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._emptyTok_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._emptyTok_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._emptyTok_ == child)
        {
            this._emptyTok_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._emptyTok_ == oldChild)
        {
            setEmptyTok((TEmptyTok) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}