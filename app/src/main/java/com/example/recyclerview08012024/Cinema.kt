package com.example.recyclerview08012024

class Cinema(
    var image: Int,
    var name: String,
    var address: String,
    var phone: String,
    var distance: String
) {

    companion object {

        fun getDataMock(): List<Cinema> {
            return mutableListOf(
                Cinema(R.drawable.galaxy_nguyen_du, "Galaxy Nguyễn Du", "116 Nguyễn Du, Quận 1, Tp. HCM", "19002224", "461 "),
                Cinema(R.drawable.galaxy_tan_binh, "Galaxy Tân Bình", "246 Nguyễn Hồng Đào, Quận tân Bình,Tp.HCM", "19002224","5800"),
                Cinema(R.drawable.galaxy_pham_van_tri, "Galaxy Phạm Văn Chí", "634Bis Phạm Văn Chí, phường 8, Quận 6, Tp.HCM", "19002224", "7100"),
                Cinema(R.drawable.galaxy_quang_trung, "Galaxy Quang Trung", "Lầu 3, TTTM CoopMart Foodcosa số 304A, Quang Trung, P.11, Q. Gò Vấp, Tp.HCM", "19002224", "7200"),
                Cinema(R.drawable.galaxy_kinh_duong_vuong, "Galaxy Kinh Dương Vương", "718bis Kinh Dương Vương, Q6, Tp.HCm", "19002224" , "7500"),
                Cinema(R.drawable.galaxy_huynh_tan_phat, " Galaxy Huỳnh Tấn Phát", "1362 Huỳnh Tấn Phát, Khu phố 1, Phường Phú Mỹ, Quận 7, Tp.HCM", "19002224", "8700")
            )
        }
    }
}