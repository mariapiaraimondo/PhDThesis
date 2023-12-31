/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class ANestedFuncName extends PFuncName
{
    private PName _name_;
    private TOpenRound _openRound_;
    private PFuncName _funcName_;
    private TCloseRound _closeRound_;

    public ANestedFuncName()
    {
        // Constructor
    }

    public ANestedFuncName(
        @SuppressWarnings("hiding") PName _name_,
        @SuppressWarnings("hiding") TOpenRound _openRound_,
        @SuppressWarnings("hiding") PFuncName _funcName_,
        @SuppressWarnings("hiding") TCloseRound _closeRound_)
    {
        // Constructor
        setName(_name_);

        setOpenRound(_openRound_);

        setFuncName(_funcName_);

        setCloseRound(_closeRound_);

    }

    @Override
    public Object clone()
    {
        return new ANestedFuncName(
            cloneNode(this._name_),
            cloneNode(this._openRound_),
            cloneNode(this._funcName_),
            cloneNode(this._closeRound_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANestedFuncName(this);
    }

    public PName getName()
    {
        return this._name_;
    }

    public void setName(PName node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TOpenRound getOpenRound()
    {
        return this._openRound_;
    }

    public void setOpenRound(TOpenRound node)
    {
        if(this._openRound_ != null)
        {
            this._openRound_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._openRound_ = node;
    }

    public PFuncName getFuncName()
    {
        return this._funcName_;
    }

    public void setFuncName(PFuncName node)
    {
        if(this._funcName_ != null)
        {
            this._funcName_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._funcName_ = node;
    }

    public TCloseRound getCloseRound()
    {
        return this._closeRound_;
    }

    public void setCloseRound(TCloseRound node)
    {
        if(this._closeRound_ != null)
        {
            this._closeRound_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._closeRound_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._name_)
            + toString(this._openRound_)
            + toString(this._funcName_)
            + toString(this._closeRound_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._openRound_ == child)
        {
            this._openRound_ = null;
            return;
        }

        if(this._funcName_ == child)
        {
            this._funcName_ = null;
            return;
        }

        if(this._closeRound_ == child)
        {
            this._closeRound_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((PName) newChild);
            return;
        }

        if(this._openRound_ == oldChild)
        {
            setOpenRound((TOpenRound) newChild);
            return;
        }

        if(this._funcName_ == oldChild)
        {
            setFuncName((PFuncName) newChild);
            return;
        }

        if(this._closeRound_ == oldChild)
        {
            setCloseRound((TCloseRound) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
