/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class AListTransactionList extends PTransactionList
{
    private PTransaction _transaction_;
    private TComma _comma_;
    private PTransactionList _transactionList_;

    public AListTransactionList()
    {
        // Constructor
    }

    public AListTransactionList(
        @SuppressWarnings("hiding") PTransaction _transaction_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PTransactionList _transactionList_)
    {
        // Constructor
        setTransaction(_transaction_);

        setComma(_comma_);

        setTransactionList(_transactionList_);

    }

    @Override
    public Object clone()
    {
        return new AListTransactionList(
            cloneNode(this._transaction_),
            cloneNode(this._comma_),
            cloneNode(this._transactionList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListTransactionList(this);
    }

    public PTransaction getTransaction()
    {
        return this._transaction_;
    }

    public void setTransaction(PTransaction node)
    {
        if(this._transaction_ != null)
        {
            this._transaction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transaction_ = node;
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

    public PTransactionList getTransactionList()
    {
        return this._transactionList_;
    }

    public void setTransactionList(PTransactionList node)
    {
        if(this._transactionList_ != null)
        {
            this._transactionList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._transactionList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._transaction_)
            + toString(this._comma_)
            + toString(this._transactionList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._transaction_ == child)
        {
            this._transaction_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._transactionList_ == child)
        {
            this._transactionList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._transaction_ == oldChild)
        {
            setTransaction((PTransaction) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._transactionList_ == oldChild)
        {
            setTransactionList((PTransactionList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
