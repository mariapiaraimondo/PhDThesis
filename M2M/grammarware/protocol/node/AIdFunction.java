/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.node;

import protocol.analysis.*;

@SuppressWarnings("nls")
public final class AIdFunction extends PFunction
{
    private PIdClause _idClause_;

    public AIdFunction()
    {
        // Constructor
    }

    public AIdFunction(
        @SuppressWarnings("hiding") PIdClause _idClause_)
    {
        // Constructor
        setIdClause(_idClause_);

    }

    @Override
    public Object clone()
    {
        return new AIdFunction(
            cloneNode(this._idClause_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdFunction(this);
    }

    public PIdClause getIdClause()
    {
        return this._idClause_;
    }

    public void setIdClause(PIdClause node)
    {
        if(this._idClause_ != null)
        {
            this._idClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idClause_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._idClause_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._idClause_ == child)
        {
            this._idClause_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._idClause_ == oldChild)
        {
            setIdClause((PIdClause) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}