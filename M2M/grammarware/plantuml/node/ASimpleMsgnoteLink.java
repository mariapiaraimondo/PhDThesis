/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleMsgnoteLink extends PMsgnoteLink
{
    private TNoteMsgAng _quot1_;
    private PMessageRef _messageRef_;
    private TNoteMsgAng _quot2_;
    private TMsgLink _msgLink_;
    private PNoteRef _noteRef_;

    public ASimpleMsgnoteLink()
    {
        // Constructor
    }

    public ASimpleMsgnoteLink(
        @SuppressWarnings("hiding") TNoteMsgAng _quot1_,
        @SuppressWarnings("hiding") PMessageRef _messageRef_,
        @SuppressWarnings("hiding") TNoteMsgAng _quot2_,
        @SuppressWarnings("hiding") TMsgLink _msgLink_,
        @SuppressWarnings("hiding") PNoteRef _noteRef_)
    {
        // Constructor
        setQuot1(_quot1_);

        setMessageRef(_messageRef_);

        setQuot2(_quot2_);

        setMsgLink(_msgLink_);

        setNoteRef(_noteRef_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleMsgnoteLink(
            cloneNode(this._quot1_),
            cloneNode(this._messageRef_),
            cloneNode(this._quot2_),
            cloneNode(this._msgLink_),
            cloneNode(this._noteRef_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleMsgnoteLink(this);
    }

    public TNoteMsgAng getQuot1()
    {
        return this._quot1_;
    }

    public void setQuot1(TNoteMsgAng node)
    {
        if(this._quot1_ != null)
        {
            this._quot1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._quot1_ = node;
    }

    public PMessageRef getMessageRef()
    {
        return this._messageRef_;
    }

    public void setMessageRef(PMessageRef node)
    {
        if(this._messageRef_ != null)
        {
            this._messageRef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._messageRef_ = node;
    }

    public TNoteMsgAng getQuot2()
    {
        return this._quot2_;
    }

    public void setQuot2(TNoteMsgAng node)
    {
        if(this._quot2_ != null)
        {
            this._quot2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._quot2_ = node;
    }

    public TMsgLink getMsgLink()
    {
        return this._msgLink_;
    }

    public void setMsgLink(TMsgLink node)
    {
        if(this._msgLink_ != null)
        {
            this._msgLink_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._msgLink_ = node;
    }

    public PNoteRef getNoteRef()
    {
        return this._noteRef_;
    }

    public void setNoteRef(PNoteRef node)
    {
        if(this._noteRef_ != null)
        {
            this._noteRef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._noteRef_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._quot1_)
            + toString(this._messageRef_)
            + toString(this._quot2_)
            + toString(this._msgLink_)
            + toString(this._noteRef_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._quot1_ == child)
        {
            this._quot1_ = null;
            return;
        }

        if(this._messageRef_ == child)
        {
            this._messageRef_ = null;
            return;
        }

        if(this._quot2_ == child)
        {
            this._quot2_ = null;
            return;
        }

        if(this._msgLink_ == child)
        {
            this._msgLink_ = null;
            return;
        }

        if(this._noteRef_ == child)
        {
            this._noteRef_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._quot1_ == oldChild)
        {
            setQuot1((TNoteMsgAng) newChild);
            return;
        }

        if(this._messageRef_ == oldChild)
        {
            setMessageRef((PMessageRef) newChild);
            return;
        }

        if(this._quot2_ == oldChild)
        {
            setQuot2((TNoteMsgAng) newChild);
            return;
        }

        if(this._msgLink_ == oldChild)
        {
            setMsgLink((TMsgLink) newChild);
            return;
        }

        if(this._noteRef_ == oldChild)
        {
            setNoteRef((PNoteRef) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
