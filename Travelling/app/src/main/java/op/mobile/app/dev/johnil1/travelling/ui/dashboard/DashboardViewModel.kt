package op.mobile.app.dev.johnil1.travelling.ui.dashboard

import androidx.lifecycle.ViewModel
import op.mobile.app.dev.johnil1.travelling.models.Country

class DashboardViewModel(_country: Country) : ViewModel() {
    var country: Country = _country

}