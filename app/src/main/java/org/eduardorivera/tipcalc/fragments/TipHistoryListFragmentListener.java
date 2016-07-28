package org.eduardorivera.tipcalc.fragments;

import org.eduardorivera.tipcalc.model.TipRecord;

/**
 * Created by eduardo rivera on 12/06/2016
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}