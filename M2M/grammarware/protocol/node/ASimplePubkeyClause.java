/* This file was generated by SableCC (http://www.sablecc.org/). */

package protocol.node;

import protocol.analysis.*;

@SuppressWarnings("nls")
public final class ASimplePubkeyClause extends PPubkeyClause
{
    private TPubkeyTok _pubkeyTok_;
    private TOpenRound _openRound_;
    private PArgument _argument_;
    private TCloseRound _closeRound_;

    public ASimplePubkeyClause()
    {
        // Constructor
    }

    public ASimplePubkeyClause(
        @SuppressWarnings("hiding") TPubkeyTok _pubkeyTok_,
        @SuppressWarnings("hiding") TOpenRound _openRound_,
        @SuppressWarnings("hiding") PArgument _argument_,
        @SuppressWarnings("hiding") TCloseRound _closeRound_)
    {
        // Constructor
        setPubkeyTok(_pubkeyTok_);

        setOpenRound(_openRound_);

        setArgument(_argument_);

        setCloseRound(_closeRound_);

    }

    @Override
    public Object clone()
    {
        return new ASimplePubkeyClause(
            cloneNode(this._pubkeyTok_),
            cloneNode(this._openRound_),
            cloneNode(this._argument_),
            cloneNode(this._closeRound_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimplePubkeyClause(this);
    }

    public TPubkeyTok getPubkeyTok()
    {
        return this._pubkeyTok_;
    }

    public void setPubkeyTok(TPubkeyTok node)
    {
        if(this._pubkeyTok_ != null)
        {
            this._pubkeyTok_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pubkeyTok_ = node;
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

    public PArgument getArgument()
    {
        return this._argument_;
    }

    public void setArgument(PArgument node)
    {
        if(this._argument_ != null)
        {
            this._argument_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._argument_ = node;
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
            + toString(this._pubkeyTok_)
            + toString(this._openRound_)
            + toString(this._argument_)
            + toString(this._closeRound_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._pubkeyTok_ == child)
        {
            this._pubkeyTok_ = null;
            return;
        }

        if(this._openRound_ == child)
        {
            this._openRound_ = null;
            return;
        }

        if(this._argument_ == child)
        {
            this._argument_ = null;
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
        if(this._pubkeyTok_ == oldChild)
        {
            setPubkeyTok((TPubkeyTok) newChild);
            return;
        }

        if(this._openRound_ == oldChild)
        {
            setOpenRound((TOpenRound) newChild);
            return;
        }

        if(this._argument_ == oldChild)
        {
            setArgument((PArgument) newChild);
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