/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class ALeftPositionPosition extends PPosition
{
    private TLeftTok _leftTok_;

    public ALeftPositionPosition()
    {
        // Constructor
    }

    public ALeftPositionPosition(
        @SuppressWarnings("hiding") TLeftTok _leftTok_)
    {
        // Constructor
        setLeftTok(_leftTok_);

    }

    @Override
    public Object clone()
    {
        return new ALeftPositionPosition(
            cloneNode(this._leftTok_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeftPositionPosition(this);
    }

    public TLeftTok getLeftTok()
    {
        return this._leftTok_;
    }

    public void setLeftTok(TLeftTok node)
    {
        if(this._leftTok_ != null)
        {
            this._leftTok_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftTok_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._leftTok_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leftTok_ == child)
        {
            this._leftTok_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._leftTok_ == oldChild)
        {
            setLeftTok((TLeftTok) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}