/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.node;

import protocol.analysis.*;

@SuppressWarnings("nls")
public final class AListDataClause extends PDataClause
{
    private PDataExpression _dataExpression_;
    private TComma _comma_;
    private PDataClause _dataClause_;

    public AListDataClause()
    {
        // Constructor
    }

    public AListDataClause(
        @SuppressWarnings("hiding") PDataExpression _dataExpression_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PDataClause _dataClause_)
    {
        // Constructor
        setDataExpression(_dataExpression_);

        setComma(_comma_);

        setDataClause(_dataClause_);

    }

    @Override
    public Object clone()
    {
        return new AListDataClause(
            cloneNode(this._dataExpression_),
            cloneNode(this._comma_),
            cloneNode(this._dataClause_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListDataClause(this);
    }

    public PDataExpression getDataExpression()
    {
        return this._dataExpression_;
    }

    public void setDataExpression(PDataExpression node)
    {
        if(this._dataExpression_ != null)
        {
            this._dataExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dataExpression_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PDataClause getDataClause()
    {
        return this._dataClause_;
    }

    public void setDataClause(PDataClause node)
    {
        if(this._dataClause_ != null)
        {
            this._dataClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dataClause_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._dataExpression_)
            + toString(this._comma_)
            + toString(this._dataClause_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._dataExpression_ == child)
        {
            this._dataExpression_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._dataClause_ == child)
        {
            this._dataClause_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._dataExpression_ == oldChild)
        {
            setDataExpression((PDataExpression) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._dataClause_ == oldChild)
        {
            setDataClause((PDataClause) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
