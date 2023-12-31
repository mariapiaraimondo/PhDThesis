/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.node;

import protocol.analysis.*;

@SuppressWarnings("nls")
public final class AWauthConditionClause extends PConditionClause
{
    private PWeakauthClause _weakauthClause_;

    public AWauthConditionClause()
    {
        // Constructor
    }

    public AWauthConditionClause(
        @SuppressWarnings("hiding") PWeakauthClause _weakauthClause_)
    {
        // Constructor
        setWeakauthClause(_weakauthClause_);

    }

    @Override
    public Object clone()
    {
        return new AWauthConditionClause(
            cloneNode(this._weakauthClause_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWauthConditionClause(this);
    }

    public PWeakauthClause getWeakauthClause()
    {
        return this._weakauthClause_;
    }

    public void setWeakauthClause(PWeakauthClause node)
    {
        if(this._weakauthClause_ != null)
        {
            this._weakauthClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._weakauthClause_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._weakauthClause_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._weakauthClause_ == child)
        {
            this._weakauthClause_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._weakauthClause_ == oldChild)
        {
            setWeakauthClause((PWeakauthClause) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
