/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class ADigifuncDigitalsignatureName extends PDigitalsignatureName
{
    private PFuncName _funcName_;

    public ADigifuncDigitalsignatureName()
    {
        // Constructor
    }

    public ADigifuncDigitalsignatureName(
        @SuppressWarnings("hiding") PFuncName _funcName_)
    {
        // Constructor
        setFuncName(_funcName_);

    }

    @Override
    public Object clone()
    {
        return new ADigifuncDigitalsignatureName(
            cloneNode(this._funcName_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADigifuncDigitalsignatureName(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._funcName_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._funcName_ == child)
        {
            this._funcName_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._funcName_ == oldChild)
        {
            setFuncName((PFuncName) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
