package com.example.lessonaboutdialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class DialogFragment: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = context?.run{
            AlertDialog
                .Builder(this)
                .setTitle(getString(R.string.title))
                .setMessage(getString(R.string.ask))
                .setPositiveButton(getString(R.string.yes),null)
                .setNegativeButton(getString(R.string.no),null)
                .setNeutralButton(getString(R.string.back),null)
                .setCancelable(false)
                .create()
        } ?: super.onCreateDialog(savedInstanceState)
        return dialog
    }
}