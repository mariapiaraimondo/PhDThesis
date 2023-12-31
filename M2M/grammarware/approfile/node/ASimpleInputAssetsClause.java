/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleInputAssetsClause extends PInputAssetsClause
{
    private TInputassetsTaggedtok _inputassetsTaggedtok_;
    private TEquals _equals_;
    private TOpenCurly _co_;
    private PInassetsList _inassetsList_;
    private TCloseCurly _cc_;

    public ASimpleInputAssetsClause()
    {
        // Constructor
    }

    public ASimpleInputAssetsClause(
        @SuppressWarnings("hiding") TInputassetsTaggedtok _inputassetsTaggedtok_,
        @SuppressWarnings("hiding") TEquals _equals_,
        @SuppressWarnings("hiding") TOpenCurly _co_,
        @SuppressWarnings("hiding") PInassetsList _inassetsList_,
        @SuppressWarnings("hiding") TCloseCurly _cc_)
    {
        // Constructor
        setInputassetsTaggedtok(_inputassetsTaggedtok_);

        setEquals(_equals_);

        setCo(_co_);

        setInassetsList(_inassetsList_);

        setCc(_cc_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleInputAssetsClause(
            cloneNode(this._inputassetsTaggedtok_),
            cloneNode(this._equals_),
            cloneNode(this._co_),
            cloneNode(this._inassetsList_),
            cloneNode(this._cc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleInputAssetsClause(this);
    }

    public TInputassetsTaggedtok getInputassetsTaggedtok()
    {
        return this._inputassetsTaggedtok_;
    }

    public void setInputassetsTaggedtok(TInputassetsTaggedtok node)
    {
        if(this._inputassetsTaggedtok_ != null)
        {
            this._inputassetsTaggedtok_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inputassetsTaggedtok_ = node;
    }

    public TEquals getEquals()
    {
        return this._equals_;
    }

    public void setEquals(TEquals node)
    {
        if(this._equals_ != null)
        {
            this._equals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equals_ = node;
    }

    public TOpenCurly getCo()
    {
        return this._co_;
    }

    public void setCo(TOpenCurly node)
    {
        if(this._co_ != null)
        {
            this._co_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._co_ = node;
    }

    public PInassetsList getInassetsList()
    {
        return this._inassetsList_;
    }

    public void setInassetsList(PInassetsList node)
    {
        if(this._inassetsList_ != null)
        {
            this._inassetsList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inassetsList_ = node;
    }

    public TCloseCurly getCc()
    {
        return this._cc_;
    }

    public void setCc(TCloseCurly node)
    {
        if(this._cc_ != null)
        {
            this._cc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inputassetsTaggedtok_)
            + toString(this._equals_)
            + toString(this._co_)
            + toString(this._inassetsList_)
            + toString(this._cc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inputassetsTaggedtok_ == child)
        {
            this._inputassetsTaggedtok_ = null;
            return;
        }

        if(this._equals_ == child)
        {
            this._equals_ = null;
            return;
        }

        if(this._co_ == child)
        {
            this._co_ = null;
            return;
        }

        if(this._inassetsList_ == child)
        {
            this._inassetsList_ = null;
            return;
        }

        if(this._cc_ == child)
        {
            this._cc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inputassetsTaggedtok_ == oldChild)
        {
            setInputassetsTaggedtok((TInputassetsTaggedtok) newChild);
            return;
        }

        if(this._equals_ == oldChild)
        {
            setEquals((TEquals) newChild);
            return;
        }

        if(this._co_ == oldChild)
        {
            setCo((TOpenCurly) newChild);
            return;
        }

        if(this._inassetsList_ == oldChild)
        {
            setInassetsList((PInassetsList) newChild);
            return;
        }

        if(this._cc_ == oldChild)
        {
            setCc((TCloseCurly) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
