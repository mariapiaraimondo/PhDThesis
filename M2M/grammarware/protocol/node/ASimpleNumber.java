/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.node;

import protocol.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleNumber extends PNumber
{
    private TDigitSeq _digitSeq_;

    public ASimpleNumber()
    {
        // Constructor
    }

    public ASimpleNumber(
        @SuppressWarnings("hiding") TDigitSeq _digitSeq_)
    {
        // Constructor
        setDigitSeq(_digitSeq_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleNumber(
            cloneNode(this._digitSeq_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleNumber(this);
    }

    public TDigitSeq getDigitSeq()
    {
        return this._digitSeq_;
    }

    public void setDigitSeq(TDigitSeq node)
    {
        if(this._digitSeq_ != null)
        {
            this._digitSeq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._digitSeq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._digitSeq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._digitSeq_ == child)
        {
            this._digitSeq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._digitSeq_ == oldChild)
        {
            setDigitSeq((TDigitSeq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
