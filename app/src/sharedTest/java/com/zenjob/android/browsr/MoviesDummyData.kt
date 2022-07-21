package com.zenjob.android.browsr

import com.zenjob.android.browsr.list.data.remote.MovieDto
import com.zenjob.android.browsr.list.data.remote.MoviePageDto
import com.zenjob.android.browsr.list.domain.model.Movie
import com.zenjob.android.browsr.list.domain.model.Movies

object MoviesDummyData {

    fun provideDomainModelsList(): Movies {
        return Movies(
            1,
            listOf(
                Movie(0, "", "", "https://image.tmdb.org/t/p/original", "",0f),
                Movie(1, "c", "e", "https://image.tmdb.org/t/p/original", "",0f),
                Movie(2, "d", "f", "https://image.tmdb.org/t/p/original", "",0f),
            )
        )

    }

    fun provideMoviesDtosList(): MoviePageDto {
        return MoviePageDto(
            1, 1, 1,
            listOf(
                MovieDto(0, "", "", "", null, null, null),
                MovieDto(1, "a", "c", "e", null, null, null),
                MovieDto(2, "b", "d", "f", null, null, null),
            )
        )

    }


    fun provideJson():String{
       return """
            {
            "page": 1,
            "results": [
              {
            "adult": false,
            "backdrop_path": "/393mh1AJ0GYWVD7Hsq5KkFaTAoT.jpg",
            "genre_ids": [
              12,
              28,
              878
            ],
            "id": 507086,
            "original_language": "en",
            "original_title": "Jurassic World Dominion",
            "overview": "Four years after Isla Nublar was destroyed, dinosaurs now live—and hunt—alongside humans all over the world. This fragile balance will reshape the future and determine, once and for all, whether human beings are to remain the apex predators on a planet they now share with history’s most fearsome creatures.",
            "popularity": 14064.562,
            "poster_path": "/kAVRgw7GgK1CfYEJq8ME6EvRIgU.jpg",
            "release_date": "2022-06-01",
            "title": "Jurassic World Dominion",
            "video": false,
            "vote_average": 7,
            "vote_count": 1680
            },
              {
            "adult": false,
            "backdrop_path": "/nmGWzTLMXy9x7mKd8NKPLmHtWGa.jpg",
            "genre_ids": [
              10751,
              16,
              12,
              35,
              14
            ],
            "id": 438148,
            "original_language": "en",
            "original_title": "Minions: The Rise of Gru",
            "overview": "A fanboy of a supervillain supergroup known as the Vicious 6, Gru hatches a plan to become evil enough to join them, with the backup of his followers, the Minions.",
            "popularity": 10287.489,
            "poster_path": "/wKiOkZTN9lUUUNZLmtnwubZYONg.jpg",
            "release_date": "2022-06-29",
            "title": "Minions: The Rise of Gru",
            "video": false,
            "vote_average": 7.6,
            "vote_count": 402
            },
              {
            "adult": false,
            "backdrop_path": "/odJ4hx6g6vBt4lBWKFD1tI8WS4x.jpg",
            "genre_ids": [
              28,
              18
            ],
            "id": 361743,
            "original_language": "en",
            "original_title": "Top Gun: Maverick",
            "overview": "After more than thirty years of service as one of the Navy’s top aviators, and dodging the advancement in rank that would ground him, Pete “Maverick” Mitchell finds himself training a detachment of TOP GUN graduates for a specialized mission the likes of which no living pilot has ever seen.",
            "popularity": 9543.951,
            "poster_path": "/62HCnUTziyWcpDaBO2i1DX17ljH.jpg",
            "release_date": "2022-05-24",
            "title": "Top Gun: Maverick",
            "video": false,
            "vote_average": 8.4,
            "vote_count": 1600
            },
              {
            "adult": false,
            "backdrop_path": "/nW5fUbldp1DYf2uQ3zJTUdachOu.jpg",
            "genre_ids": [
              16,
              878,
              12,
              28,
              10751
            ],
            "id": 718789,
            "original_language": "en",
            "original_title": "Lightyear",
            "overview": "Legendary Space Ranger Buzz Lightyear embarks on an intergalactic adventure alongside a group of ambitious recruits and his robot companion Sox.",
            "popularity": 7159.091,
            "poster_path": "/4sBbVik86fOuyRY4kFGbn2sooQk.jpg",
            "release_date": "2022-06-15",
            "title": "Lightyear",
            "video": false,
            "vote_average": 7.2,
            "vote_count": 763
            },
              {
            "adult": false,
            "backdrop_path": "/tsC3DRGAQvkoA88lQQfbQ40byFS.jpg",
            "genre_ids": [
              27,
              53
            ],
            "id": 756999,
            "original_language": "en",
            "original_title": "The Black Phone",
            "overview": "Finney Shaw, a shy but clever 13-year-old boy, is abducted by a sadistic killer and trapped in a soundproof basement where screaming is of little use. When a disconnected phone on the wall begins to ring, Finney discovers that he can hear the voices of the killer’s previous victims. And they are dead set on making sure that what happened to them doesn’t happen to Finney.",
            "popularity": 5992.936,
            "poster_path": "/bxHZpV02OOu9vq3sb3MsOudEnYc.jpg",
            "release_date": "2022-06-22",
            "title": "The Black Phone",
            "video": false,
            "vote_average": 7.8,
            "vote_count": 772
            },
              {
            "adult": false,
            "backdrop_path": "/wcKFYIiVDvRURrzglV9kGu7fpfY.jpg",
            "genre_ids": [
              14,
              28,
              12
            ],
            "id": 453395,
            "original_language": "en",
            "original_title": "Doctor Strange in the Multiverse of Madness",
            "overview": "Doctor Strange, with the help of mystical allies both old and new, traverses the mind-bending and dangerous alternate realities of the Multiverse to confront a mysterious new adversary.",
            "popularity": 4410.561,
            "poster_path": "/9Gtg2DzBhmYamXBS1hKAhiwbBKS.jpg",
            "release_date": "2022-05-04",
            "title": "Doctor Strange in the Multiverse of Madness",
            "video": false,
            "vote_average": 7.5,
            "vote_count": 4578
            },
              {
            "adult": false,
            "backdrop_path": "/p1F51Lvj3sMopG948F5HsBbl43C.jpg",
            "genre_ids": [
              28,
              12,
              14
            ],
            "id": 616037,
            "original_language": "en",
            "original_title": "Thor: Love and Thunder",
            "overview": "After his retirement is interrupted by Gorr the God Butcher, a galactic killer who seeks the extinction of the gods, Thor enlists the help of King Valkyrie, Korg, and ex-girlfriend Jane Foster, who now inexplicably wields Mjolnir as the Mighty Thor. Together they embark upon a harrowing cosmic adventure to uncover the mystery of the God Butcher’s vengeance and stop him before it’s too late.",
            "popularity": 3503.056,
            "poster_path": "/pIkRyD18kl4FhoCNQuWxWu5cBLM.jpg",
            "release_date": "2022-07-08",
            "title": "Thor: Love and Thunder",
            "video": false,
            "vote_average": 6.8,
            "vote_count": 1065
            },
              {
            "adult": false,
            "backdrop_path": "/5PnypKiSj2efSPqThNjTXz8jwOg.jpg",
            "genre_ids": [
              14,
              28
            ],
            "id": 759175,
            "original_language": "en",
            "original_title": "The Princess",
            "overview": "A beautiful, strong-willed young royal refuses to wed the cruel sociopath to whom she is betrothed and is kidnapped and locked in a remote tower of her father’s castle. With her scorned, vindictive suitor intent on taking her father’s throne, the princess must protect her family and save the kingdom.",
            "popularity": 2906.441,
            "poster_path": "/9pCoqX24a6rE981fY1O3PmhiwrB.jpg",
            "release_date": "2022-06-16",
            "title": "The Princess",
            "video": false,
            "vote_average": 6.8,
            "vote_count": 167
            },
              {
            "adult": false,
            "backdrop_path": "/jazlkwXfw4KdF6fVTRsolOvRCmu.jpg",
            "genre_ids": [
              53
            ],
            "id": 924482,
            "original_language": "en",
            "original_title": "The Ledge",
            "overview": "A rock climbing adventure between two friends turns into a terrifying nightmare. After Kelly captures the murder of her best friend on camera, she becomes the next target of a tight-knit group of friends who will stop at nothing to destroy the evidence and anyone in their way. Desperate for her safety, she begins a treacherous climb up a mountain cliff and her survival instincts are put to the test when she becomes trapped with the killers just 20 feet away.",
            "popularity": 2224.864,
            "poster_path": "/mKFT6Q7PjrRLYuPLfmH4WLCXOiD.jpg",
            "release_date": "2022-02-18",
            "title": "The Ledge",
            "video": false,
            "vote_average": 6.2,
            "vote_count": 62
            },
              {
            "adult": false,
            "backdrop_path": "/t9K8ycUBCplWiICDOKRNRYcEH9e.jpg",
            "genre_ids": [
              16,
              28,
              14
            ],
            "id": 810693,
            "original_language": "ja",
            "original_title": "劇場版 呪術廻戦 0",
            "overview": "Yuta Okkotsu is a nervous high school student who is suffering from a serious problem—his childhood friend Rika has turned into a curse and won't leave him alone. Since Rika is no ordinary curse, his plight is noticed by Satoru Gojo, a teacher at Jujutsu High, a school where fledgling exorcists learn how to combat curses. Gojo convinces Yuta to enroll, but can he learn enough in time to confront the curse that haunts him?",
            "popularity": 1712.85,
            "poster_path": "/3pTwMUEavTzVOh6yLN0aEwR7uSy.jpg",
            "release_date": "2021-12-24",
            "title": "Jujutsu Kaisen 0",
            "video": false,
            "vote_average": 7.9,
            "vote_count": 223
            },
              {
            "adult": false,
            "backdrop_path": "/egoyMDLqCxzjnSrWOz50uLlJWmD.jpg",
            "genre_ids": [
              28,
              12,
              10751,
              35
            ],
            "id": 675353,
            "original_language": "en",
            "original_title": "Sonic the Hedgehog 2",
            "overview": "After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations. Sonic teams up with his own sidekick, Tails, and together they embark on a globe-trotting journey to find the emerald before it falls into the wrong hands.",
            "popularity": 1654.126,
            "poster_path": "/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg",
            "release_date": "2022-03-30",
            "title": "Sonic the Hedgehog 2",
            "video": false,
            "vote_average": 7.7,
            "vote_count": 2517
            },
              {
            "adult": false,
            "backdrop_path": "/mTupUmnuwwAyA0CNqpwaZn5mqjk.jpg",
            "genre_ids": [
              28,
              27,
              53,
              10752,
              14
            ],
            "id": 697799,
            "original_language": "en",
            "original_title": "WarHunt",
            "overview": "1945. A U.S. military cargo plane loses control and violently crashes behind enemy lines in the middle of the German black forest. Major Johnson sends a squad of his bravest soldiers on a rescue mission to retrieve the top-secret material the plane was carrying, led by Sergeants Brewer and Walsh. They soon discover hanged Nazi soldiers and other dead bodies bearing ancient, magical symbols. Suddenly their compasses fail, their perceptions twist and straying from the group leads to profound horrors as they are attacked by a powerful, supernatural force.",
            "popularity": 1672.976,
            "poster_path": "/9HFFwZOTBB7IPFmn9E0MXdWave3.jpg",
            "release_date": "2022-01-21",
            "title": "WarHunt",
            "video": false,
            "vote_average": 5.4,
            "vote_count": 39
            },
              {
            "adult": false,
            "backdrop_path": "/ocUp7DJBIc8VJgLEw1prcyK1dYv.jpg",
            "genre_ids": [
              28,
              12,
              878
            ],
            "id": 634649,
            "original_language": "en",
            "original_title": "Spider-Man: No Way Home",
            "overview": "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
            "popularity": 1623.751,
            "poster_path": "/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
            "release_date": "2021-12-15",
            "title": "Spider-Man: No Way Home",
            "video": false,
            "vote_average": 8.1,
            "vote_count": 14219
            },
              {
            "adult": false,
            "backdrop_path": "/t0mwKhUDa62hdhdKSsN4xMfhY5Z.jpg",
            "genre_ids": [
              18,
              35
            ],
            "id": 626735,
            "original_language": "en",
            "original_title": "Dog",
            "overview": "An army ranger and his dog embark on a road trip along the Pacific Coast Highway to attend a friend's funeral.",
            "popularity": 1574.089,
            "poster_path": "/rkpLvPDe0ZE62buUS32exdNr7zD.jpg",
            "release_date": "2022-02-17",
            "title": "Dog",
            "video": false,
            "vote_average": 7.4,
            "vote_count": 623
            },
              {
            "adult": false,
            "backdrop_path": "/zGLHX92Gk96O1DJvLil7ObJTbaL.jpg",
            "genre_ids": [
              14,
              12,
              28
            ],
            "id": 338953,
            "original_language": "en",
            "original_title": "Fantastic Beasts: The Secrets of Dumbledore",
            "overview": "Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him alone, he entrusts magizoologist Newt Scamander to lead an intrepid team of wizards and witches. They soon encounter an array of old and new beasts as they clash with Grindelwald's growing legion of followers.",
            "popularity": 1384.42,
            "poster_path": "/8ZbybiGYe8XM4WGmGlhF0ec5R7u.jpg",
            "release_date": "2022-04-06",
            "title": "Fantastic Beasts: The Secrets of Dumbledore",
            "video": false,
            "vote_average": 6.8,
            "vote_count": 2277
            },
              {
            "adult": false,
            "backdrop_path": "/g3pG27i0v6eKWDKLf4GQsKZxmZX.jpg",
            "genre_ids": [
              53,
              28
            ],
            "id": 888195,
            "original_language": "en",
            "original_title": "Hot Seat",
            "overview": "An ex-hacker is forced to break into high-level banking institutions, another man must try to penetrate the booby-trapped building to get the young man off the hot seat.",
            "popularity": 1373.931,
            "poster_path": "/TUmSO5EPIZAfRSOEjmbrgbTw8i.jpg",
            "release_date": "2022-07-01",
            "title": "Hot Seat",
            "video": false,
            "vote_average": 6.8,
            "vote_count": 16
            },
              {
            "adult": false,
            "backdrop_path": "/riyxG4iMQID7GovFPEGI3czQMYz.jpg",
            "genre_ids": [
              28,
              53
            ],
            "id": 961484,
            "original_language": "en",
            "original_title": "Last Seen Alive",
            "overview": "After Will Spann's wife suddenly vanishes at a gas station, his desperate search to find her leads him down a dark path that forces him to run from authorities and take the law into his own hands.",
            "popularity": 2032.372,
            "poster_path": "/qvqyDj34Uivokf4qIvK4bH0m0qF.jpg",
            "release_date": "2022-05-19",
            "title": "Last Seen Alive",
            "video": false,
            "vote_average": 6.6,
            "vote_count": 135
            },
              {
            "adult": false,
            "backdrop_path": "/wUwizGzbTk5CTiKBnE4Pq1MONwD.jpg",
            "genre_ids": [
              16,
              12,
              10751,
              14
            ],
            "id": 560057,
            "original_language": "en",
            "original_title": "The Sea Beast",
            "overview": "The life of a legendary sea monster hunter is turned upside down when a young girl stows away on his ship.",
            "popularity": 1865.101,
            "poster_path": "/ro3uuFrRxPI8bm6x9IavCr3nbCX.jpg",
            "release_date": "2022-06-24",
            "title": "The Sea Beast",
            "video": false,
            "vote_average": 7.6,
            "vote_count": 310
            },
              {
            "adult": false,
            "backdrop_path": "/1Ds7xy7ILo8u2WWxdnkJth1jQVT.jpg",
            "genre_ids": [
              28,
              12,
              35
            ],
            "id": 752623,
            "original_language": "en",
            "original_title": "The Lost City",
            "overview": "A reclusive romance novelist was sure nothing could be worse than getting stuck on a book tour with her cover model until a kidnapping attempt sweeps them both into a cutthroat jungle adventure, proving life can be so much stranger, and more romantic, than any of her paperback fictions.",
            "popularity": 1164.654,
            "poster_path": "/neMZH82Stu91d3iqvLdNQfqPPyl.jpg",
            "release_date": "2022-03-24",
            "title": "The Lost City",
            "video": false,
            "vote_average": 6.8,
            "vote_count": 1528
            },
              {
            "adult": false,
            "backdrop_path": "/qBu6blwnOA75Hz61QHrNe8unUNw.jpg",
            "genre_ids": [
              53,
              80,
              18
            ],
            "id": 975714,
            "original_language": "en",
            "original_title": "Collision",
            "overview": "Over the course of one fateful day, a corrupt businessman and his socialite wife race to save their daughter from a notorious crime lord.",
            "popularity": 1218.564,
            "poster_path": "/4zsihgkxMZ7MrflNCjkD3ySFJtc.jpg",
            "release_date": "2022-06-16",
            "title": "Collision",
            "video": false,
            "vote_average": 5.8,
            "vote_count": 85
            }
            ],
            "total_pages": 34382,
            "total_results": 687639
            }
        """.trimIndent()
    }

}