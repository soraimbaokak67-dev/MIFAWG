/*
 * Copyright © 2017-2025 WireGuard LLC. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
package com.mifawg.forkwireguard.app.activity

import android.os.Bundle
import com.mifawg.forkwireguard.app.R
import com.mifawg.forkwireguard.app.model.ObservableTunnel

/**
 * Standalone activity for creating tunnels.
 */
class TunnelCreatorActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tunnel_creator_activity)
    }

    override fun onSelectedTunnelChanged(oldTunnel: ObservableTunnel?, newTunnel: ObservableTunnel?): Boolean {
        finish()
        return true
    }
}
