/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleOutputAssetsClause extends POutputAssetsClause
{
    private TOutputassetsTaggedtok _outputassetsTaggedtok_;
    private TEquals _equals_;
    private TOpenCurly _co_;
    private POutassetsList _outassetsList_;
    private TCloseCurly _cc_;

    public ASimpleOutputAssetsClause()
    {
        // Constructor
    }

    public ASimpleOutputAssetsClause(
        @SuppressWarnings("hiding") TOutputassetsTaggedtok _outputassetsTaggedtok_,
        @SuppressWarnings("hiding") TEquals _equals_,
        @SuppressWarnings("hiding") TOpenCurly _co_,
        @SuppressWarnings("hiding") POutassetsList _outassetsList_,
        @SuppressWarnings("hiding") TCloseCurly _cc_)
    {
        // Constructor
        setOutputassetsTaggedtok(_outputassetsTaggedtok_);

        setEquals(_equals_);

        setCo(_co_);

        setOutassetsList(_outassetsList_);

        setCc(_cc_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleOutputAssetsClause(
            cloneNode(this._outputassetsTaggedtok_),
            cloneNode(this._equals_),
            cloneNode(this._co_),
            cloneNode(this._outassetsList_),
            cloneNode(this._cc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleOutputAssetsClause(this);
    }

    public TOutputassetsTaggedtok getOutputassetsTaggedtok()
    {
        return this._outputassetsTaggedtok_;
    }

    public void setOutputassetsTaggedtok(TOutputassetsTaggedtok node)
    {
        if(this._outputassetsTaggedtok_ != null)
        {
            this._outputassetsTaggedtok_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._outputassetsTaggedtok_ = node;
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

    public POutassetsList getOutassetsList()
    {
        return this._outassetsList_;
    }

    public void setOutassetsList(POutassetsList node)
    {
        if(this._outassetsList_ != null)
        {
            this._outassetsList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._outassetsList_ = node;
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
            + toString(this._outputassetsTaggedtok_)
            + toString(this._equals_)
            + toString(this._co_)
            + toString(this._outassetsList_)
            + toString(this._cc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._outputassetsTaggedtok_ == child)
        {
            this._outputassetsTaggedtok_ = null;
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

        if(this._outassetsList_ == child)
        {
            this._outassetsList_ = null;
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
        if(this._outputassetsTaggedtok_ == oldChild)
        {
            setOutputassetsTaggedtok((TOutputassetsTaggedtok) newChild);
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

        if(this._outassetsList_ == oldChild)
        {
            setOutassetsList((POutassetsList) newChild);
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
