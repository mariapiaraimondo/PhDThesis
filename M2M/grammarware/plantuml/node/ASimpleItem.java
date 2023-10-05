/* This file was generated by SableCC (http://www.sablecc.org/). */

package plantuml.node;

import java.util.*;
import plantuml.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleItem extends PItem
{
    private PItemCore _itemCore_;
    private final LinkedList<TNewLine> _newLine_ = new LinkedList<TNewLine>();

    public ASimpleItem()
    {
        // Constructor
    }

    public ASimpleItem(
        @SuppressWarnings("hiding") PItemCore _itemCore_,
        @SuppressWarnings("hiding") List<?> _newLine_)
    {
        // Constructor
        setItemCore(_itemCore_);

        setNewLine(_newLine_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleItem(
            cloneNode(this._itemCore_),
            cloneList(this._newLine_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleItem(this);
    }

    public PItemCore getItemCore()
    {
        return this._itemCore_;
    }

    public void setItemCore(PItemCore node)
    {
        if(this._itemCore_ != null)
        {
            this._itemCore_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._itemCore_ = node;
    }

    public LinkedList<TNewLine> getNewLine()
    {
        return this._newLine_;
    }

    public void setNewLine(List<?> list)
    {
        for(TNewLine e : this._newLine_)
        {
            e.parent(null);
        }
        this._newLine_.clear();

        for(Object obj_e : list)
        {
            TNewLine e = (TNewLine) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._newLine_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._itemCore_)
            + toString(this._newLine_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._itemCore_ == child)
        {
            this._itemCore_ = null;
            return;
        }

        if(this._newLine_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._itemCore_ == oldChild)
        {
            setItemCore((PItemCore) newChild);
            return;
        }

        for(ListIterator<TNewLine> i = this._newLine_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TNewLine) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}