package info.nightscout.androidaps.plugins.pump.omnipod.ui.wizard2.fragment.action

import android.os.Bundle
import android.view.View
import android.widget.TextView
import info.nightscout.androidaps.plugins.pump.omnipod.R
import info.nightscout.androidaps.plugins.pump.omnipod.ui.wizard2.fragment.FragmentBase

abstract class ActionFragmentBase : FragmentBase() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.omnipod_wizard_action_page_text)?.text = getText()
    }

    abstract fun getText(): String

    override fun getLayoutId(): Int {
        return R.layout.omnipod_replace_pod_wizard_action_page_fragment
    }
}