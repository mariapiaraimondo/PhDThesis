/* This file was generated by SableCC (http://www.sablecc.org/). */

package approfile.node;

import approfile.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleTransaction extends PTransaction
{
    private TOpenRound _openRound_;
    private PIdClause _idClause_;
    private TComma _c0_;
    private PPubkeyClause _pubkeyClause_;
    private TComma _c1_;
    private PSendaddClause _sendaddClause_;
    private TComma _c2_;
    private PDigitalsigClause _digitalsigClause_;
    private TComma _c3_;
    private PInputAssetsClause _inputAssetsClause_;
    private TComma _c4_;
    private POutputAssetsClause _outputAssetsClause_;
    private TCloseRound _closeRound_;

    public ASimpleTransaction()
    {
        // Constructor
    }

    public ASimpleTransaction(
        @SuppressWarnings("hiding") TOpenRound _openRound_,
        @SuppressWarnings("hiding") PIdClause _idClause_,
        @SuppressWarnings("hiding") TComma _c0_,
        @SuppressWarnings("hiding") PPubkeyClause _pubkeyClause_,
        @SuppressWarnings("hiding") TComma _c1_,
        @SuppressWarnings("hiding") PSendaddClause _sendaddClause_,
        @SuppressWarnings("hiding") TComma _c2_,
        @SuppressWarnings("hiding") PDigitalsigClause _digitalsigClause_,
        @SuppressWarnings("hiding") TComma _c3_,
        @SuppressWarnings("hiding") PInputAssetsClause _inputAssetsClause_,
        @SuppressWarnings("hiding") TComma _c4_,
        @SuppressWarnings("hiding") POutputAssetsClause _outputAssetsClause_,
        @SuppressWarnings("hiding") TCloseRound _closeRound_)
    {
        // Constructor
        setOpenRound(_openRound_);

        setIdClause(_idClause_);

        setC0(_c0_);

        setPubkeyClause(_pubkeyClause_);

        setC1(_c1_);

        setSendaddClause(_sendaddClause_);

        setC2(_c2_);

        setDigitalsigClause(_digitalsigClause_);

        setC3(_c3_);

        setInputAssetsClause(_inputAssetsClause_);

        setC4(_c4_);

        setOutputAssetsClause(_outputAssetsClause_);

        setCloseRound(_closeRound_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleTransaction(
            cloneNode(this._openRound_),
            cloneNode(this._idClause_),
            cloneNode(this._c0_),
            cloneNode(this._pubkeyClause_),
            cloneNode(this._c1_),
            cloneNode(this._sendaddClause_),
            cloneNode(this._c2_),
            cloneNode(this._digitalsigClause_),
            cloneNode(this._c3_),
            cloneNode(this._inputAssetsClause_),
            cloneNode(this._c4_),
            cloneNode(this._outputAssetsClause_),
            cloneNode(this._closeRound_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleTransaction(this);
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

    public TComma getC0()
    {
        return this._c0_;
    }

    public void setC0(TComma node)
    {
        if(this._c0_ != null)
        {
            this._c0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c0_ = node;
    }

    public PPubkeyClause getPubkeyClause()
    {
        return this._pubkeyClause_;
    }

    public void setPubkeyClause(PPubkeyClause node)
    {
        if(this._pubkeyClause_ != null)
        {
            this._pubkeyClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pubkeyClause_ = node;
    }

    public TComma getC1()
    {
        return this._c1_;
    }

    public void setC1(TComma node)
    {
        if(this._c1_ != null)
        {
            this._c1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c1_ = node;
    }

    public PSendaddClause getSendaddClause()
    {
        return this._sendaddClause_;
    }

    public void setSendaddClause(PSendaddClause node)
    {
        if(this._sendaddClause_ != null)
        {
            this._sendaddClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._sendaddClause_ = node;
    }

    public TComma getC2()
    {
        return this._c2_;
    }

    public void setC2(TComma node)
    {
        if(this._c2_ != null)
        {
            this._c2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c2_ = node;
    }

    public PDigitalsigClause getDigitalsigClause()
    {
        return this._digitalsigClause_;
    }

    public void setDigitalsigClause(PDigitalsigClause node)
    {
        if(this._digitalsigClause_ != null)
        {
            this._digitalsigClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._digitalsigClause_ = node;
    }

    public TComma getC3()
    {
        return this._c3_;
    }

    public void setC3(TComma node)
    {
        if(this._c3_ != null)
        {
            this._c3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c3_ = node;
    }

    public PInputAssetsClause getInputAssetsClause()
    {
        return this._inputAssetsClause_;
    }

    public void setInputAssetsClause(PInputAssetsClause node)
    {
        if(this._inputAssetsClause_ != null)
        {
            this._inputAssetsClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inputAssetsClause_ = node;
    }

    public TComma getC4()
    {
        return this._c4_;
    }

    public void setC4(TComma node)
    {
        if(this._c4_ != null)
        {
            this._c4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._c4_ = node;
    }

    public POutputAssetsClause getOutputAssetsClause()
    {
        return this._outputAssetsClause_;
    }

    public void setOutputAssetsClause(POutputAssetsClause node)
    {
        if(this._outputAssetsClause_ != null)
        {
            this._outputAssetsClause_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._outputAssetsClause_ = node;
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
            + toString(this._openRound_)
            + toString(this._idClause_)
            + toString(this._c0_)
            + toString(this._pubkeyClause_)
            + toString(this._c1_)
            + toString(this._sendaddClause_)
            + toString(this._c2_)
            + toString(this._digitalsigClause_)
            + toString(this._c3_)
            + toString(this._inputAssetsClause_)
            + toString(this._c4_)
            + toString(this._outputAssetsClause_)
            + toString(this._closeRound_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._openRound_ == child)
        {
            this._openRound_ = null;
            return;
        }

        if(this._idClause_ == child)
        {
            this._idClause_ = null;
            return;
        }

        if(this._c0_ == child)
        {
            this._c0_ = null;
            return;
        }

        if(this._pubkeyClause_ == child)
        {
            this._pubkeyClause_ = null;
            return;
        }

        if(this._c1_ == child)
        {
            this._c1_ = null;
            return;
        }

        if(this._sendaddClause_ == child)
        {
            this._sendaddClause_ = null;
            return;
        }

        if(this._c2_ == child)
        {
            this._c2_ = null;
            return;
        }

        if(this._digitalsigClause_ == child)
        {
            this._digitalsigClause_ = null;
            return;
        }

        if(this._c3_ == child)
        {
            this._c3_ = null;
            return;
        }

        if(this._inputAssetsClause_ == child)
        {
            this._inputAssetsClause_ = null;
            return;
        }

        if(this._c4_ == child)
        {
            this._c4_ = null;
            return;
        }

        if(this._outputAssetsClause_ == child)
        {
            this._outputAssetsClause_ = null;
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
        if(this._openRound_ == oldChild)
        {
            setOpenRound((TOpenRound) newChild);
            return;
        }

        if(this._idClause_ == oldChild)
        {
            setIdClause((PIdClause) newChild);
            return;
        }

        if(this._c0_ == oldChild)
        {
            setC0((TComma) newChild);
            return;
        }

        if(this._pubkeyClause_ == oldChild)
        {
            setPubkeyClause((PPubkeyClause) newChild);
            return;
        }

        if(this._c1_ == oldChild)
        {
            setC1((TComma) newChild);
            return;
        }

        if(this._sendaddClause_ == oldChild)
        {
            setSendaddClause((PSendaddClause) newChild);
            return;
        }

        if(this._c2_ == oldChild)
        {
            setC2((TComma) newChild);
            return;
        }

        if(this._digitalsigClause_ == oldChild)
        {
            setDigitalsigClause((PDigitalsigClause) newChild);
            return;
        }

        if(this._c3_ == oldChild)
        {
            setC3((TComma) newChild);
            return;
        }

        if(this._inputAssetsClause_ == oldChild)
        {
            setInputAssetsClause((PInputAssetsClause) newChild);
            return;
        }

        if(this._c4_ == oldChild)
        {
            setC4((TComma) newChild);
            return;
        }

        if(this._outputAssetsClause_ == oldChild)
        {
            setOutputAssetsClause((POutputAssetsClause) newChild);
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
