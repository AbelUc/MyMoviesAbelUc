package com.example.mymoviesabeluc

data class MediaItem(
    val id:Int,
    val title:String,
    val thumb:String,
    var type:Type
){
        enum class Type{PHOTO, VIDEO }
}

fun getMedia()=(1..10).map{
    MediaItem(
        id = it,
        title = "Title $it",
        thumb = "https://64.media.tumblr.com/9e918248d099a610411be6b99db4c10f/4e1fab6433f3d995-0e/s540x810/9824d022b46656cf99ef91aa1787fff1548b3f52.pnj",
                type = if(it%3==0) MediaItem.Type.VIDEO else MediaItem.Type.PHOTO

    )
}
