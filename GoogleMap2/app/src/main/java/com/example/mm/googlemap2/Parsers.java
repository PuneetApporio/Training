package com.example.mm.googlemap2;

import java.util.List;

public class Parsers {

    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","place_id":"ChIJtSPDWvLlDDkRctaNu6KvltQ","types":["political","sublocality","sublocality_level_1"]},{"geocoder_status":"OK","place_id":"ChIJ1TkoQu8YDTkRVXC88T9HJuU","types":["establishment","point_of_interest","subway_station","transit_station"]}]
     * routes : [{"bounds":{"northeast":{"lat":28.5870716,"lng":77.3739903},"southwest":{"lat":28.4582889,"lng":77.05819679999999}},"copyrights":"Map data ©2018 Google","legs":[{"distance":{"text":"45.4 km","value":45408},"duration":{"text":"1 hour 9 mins","value":4144},"end_address":"Delhi, Sector 29, Gurugram, Haryana 122007, India","end_location":{"lat":28.4594098,"lng":77.0724788},"start_address":"Sector 49, Noida, Uttar Pradesh, India","start_location":{"lat":28.5627292,"lng":77.3739903},"steps":[{"distance":{"text":"0.3 km","value":300},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5616428,"lng":77.3723012},"html_instructions":"Head <b>west<\/b>","polyline":{"points":"atimDmbgwM@PDp@BfB@F@JB\\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A"},"start_location":{"lat":28.5627292,"lng":77.3739903},"travel_mode":"DRIVING"},{"distance":{"text":"61 m","value":61},"duration":{"text":"1 min","value":23},"end_location":{"lat":28.5611088,"lng":77.3721545},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"gmimD{wfwMhB\\"},"start_location":{"lat":28.5616428,"lng":77.3723012},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":96},"duration":{"text":"1 min","value":37},"end_location":{"lat":28.5613842,"lng":77.37122459999999},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"}iimD}vfwMCNq@hD"},"start_location":{"lat":28.5611088,"lng":77.3721545},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":196},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.559862,"lng":77.3702292},"html_instructions":"Turn <b>left<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skimDcqfwMFDFFDDXTHHJJFD@@LF`Ab@nCpA"},"start_location":{"lat":28.5613842,"lng":77.37122459999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":44},"end_location":{"lat":28.5602486,"lng":77.36938049999999},"html_instructions":"Turn <b>right<\/b> onto <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"cbimD}jfwMLNILIHU^Wd@Sl@EL"},"start_location":{"lat":28.559862,"lng":77.3702292},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1182},"duration":{"text":"3 mins","value":159},"end_location":{"lat":28.5612915,"lng":77.3573722},"html_instructions":"Continue straight to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 800&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"qdimDsefwMGVOp@Qv@Ix@?TCl@?TAt@Bb@ALKdBMvBEn@C`BAVIdDIbCGtAGjA?TGdDAd@Ch@SpDM~CKhDQfK"},"start_location":{"lat":28.5602486,"lng":77.36938049999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":324},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.561512,"lng":77.3540692},"html_instructions":"Continue straight past Indian Oil Petrol Pump to stay on <b>Dadri Main Rd<\/b>","maneuver":"straight","polyline":{"points":"akimDqzcwMANGtBKvBGjBMhH"},"start_location":{"lat":28.5612915,"lng":77.3573722},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":540},"duration":{"text":"1 min","value":43},"end_location":{"lat":28.5612479,"lng":77.3485965},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b>","maneuver":"keep-left","polyline":{"points":"mlimD}ecwMIvDUbGClA?h@DdAHpALtALrAj@nE"},"start_location":{"lat":28.561512,"lng":77.3540692},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":695},"duration":{"text":"1 min","value":83},"end_location":{"lat":28.5603155,"lng":77.3415799},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by Ashoka Mission Public School (on the left in 500&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"yjimDwcbwMfA~KJ`BDVFl@TdEXxCLrAR~BJnAB~@AXCp@Cb@"},"start_location":{"lat":28.5612479,"lng":77.3485965},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":332},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5615885,"lng":77.33863029999999},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Amrapali Marg<\/b>","polyline":{"points":"_eimD{w`wMNb@OhAQt@WdAQb@Sb@a@t@g@v@e@v@Q`@CHg@hA"},"start_location":{"lat":28.5603155,"lng":77.3415799},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":145},"duration":{"text":"1 min","value":33},"end_location":{"lat":28.560991,"lng":77.3373106},"html_instructions":"Turn <b>left<\/b> after Police Chowki Sector-37 (on the left)","maneuver":"turn-left","polyline":{"points":"}limDme`wMb@dB?@rA~C"},"start_location":{"lat":28.5615885,"lng":77.33863029999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":975},"duration":{"text":"2 mins","value":90},"end_location":{"lat":28.5574711,"lng":77.3281682},"html_instructions":"Continue straight to stay on <b>Amrapali Marg<\/b><div style=\"font-size:0.9em\">Pass by Pearls Gateway Towers (on the left)<\/div>","maneuver":"straight","polyline":{"points":"eiimDe}_wM^pAz@rDLh@t@lCjAdExBfIBJX|@dAjDfB`GVz@z@tC\\fAZdA"},"start_location":{"lat":28.560991,"lng":77.3373106},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":468},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5555391,"lng":77.32392589999999},"html_instructions":"Continue onto <b>Maha Maya Flyover<\/b>","polyline":{"points":"eshmDad~vMHXHVdApDdAjDTv@Vt@`@hA`@hAl@pA`AjB"},"start_location":{"lat":28.5574711,"lng":77.3281682},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":824},"duration":{"text":"1 min","value":71},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Take the ramp onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"cghmDqi}vMl@`@PFJDLBTBJ?HAFAJEHCHGNKFIHMHUDQ@K@M?OCUCQEOKSOOYW_@UsAw@c@OUCU@WHIFIDKDOBy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.5555391,"lng":77.32392589999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":93},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSJaCvAoC`BYT]VWRaAd@]TMJGDA@CBKFIFe@\\KFcEnCgD~BkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit toward <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit toward <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue toward <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.9 km","value":1869},"duration":{"text":"2 mins","value":104},"end_location":{"lat":28.5722841,"lng":77.2092977},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZv@pAVb@Vb@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Jj@J`ADfAFrE@`OHp@DVHRBDDFFDHBZDl@J`@L"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":245},"duration":{"text":"1 min","value":26},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"wokmDc}fvMXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5722841,"lng":77.2092977},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the ramp onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":317},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5780024,"lng":77.17615409999999},"html_instructions":"Take the exit toward <b>Rao Tularam Marg<\/b>","maneuver":"ramp-left","polyline":{"points":"_dlmDyw`vMKPEDQL}@h@aAf@sAn@kAj@sBbAGD_@ROH"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1494},"duration":{"text":"4 mins","value":221},"end_location":{"lat":28.5724344,"lng":77.16255120000001},"html_instructions":"Turn <b>left<\/b> onto <b>Rao Tularam Marg<\/b><div style=\"font-size:0.9em\">Pass by Kendriya Vidyalaya (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"oslmD}m`vMS^KTITCXKVJXp@tBpArDhAzCrBvFFRv@~BtCrIrAtDDNhBlFVr@DLzDvKZ|@h@~AjBlFDJXz@"},"start_location":{"lat":28.5780024,"lng":77.17615409999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1754},"duration":{"text":"5 mins","value":295},"end_location":{"lat":28.5749652,"lng":77.1472837},"html_instructions":"Turn <b>right<\/b> to stay on <b>Rao Tularam Marg<\/b>","maneuver":"turn-right","polyline":{"points":"upkmD}x}uM`@jAHTFL@BBDHTIDKH{A|@g@ZWNq@`@QLWNeDrBc@X[TYRMJST_@^[`@QPKRKRa@`ACPEVKr@Gp@ARAX?X?`@@l@?N@J@RBRDTBJ?B?B?@?@AJn@~AHVRl@j@fB`AbDb@jA|ArH@P@T?Z?D?f@Gb@ADAFGr@OhAMn@M`AW~BY`DMjAe@dFSjA"},"start_location":{"lat":28.5724344,"lng":77.16255120000001},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1246},"duration":{"text":"1 min","value":84},"end_location":{"lat":28.571361,"lng":77.13584019999999},"html_instructions":"Take the ramp on the <b>right<\/b> onto <b>NH 48<\/b>","polyline":{"points":"q`lmDoyzuMIVEVOlAe@hEMvACf@Cj@?`@@`@B^B`@Jn@H^Tz@Xx@v@rBFN\\|@@J@HBd@Nj@@DJ^h@pBVz@X~@^jA|@`Cb@bAXl@Xl@NXzCzFp@lA\\j@jArB"},"start_location":{"lat":28.5749652,"lng":77.1472837},"travel_mode":"DRIVING"},{"distance":{"text":"3.8 km","value":3818},"duration":{"text":"4 mins","value":236},"end_location":{"lat":28.5430752,"lng":77.1185909},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"_jkmD_rxuMDNHNPZHHBBXZXZLJx@n@NHTLr@\\@?f@NXHh@J^Fb@Db@BdAFpHLH?H?|DLjBD`]z@tBHb@Br@HpAPx@NjATxCn@bEv@^H~A^bFlAnBh@tCt@xBp@RFZLv@`@t@b@RPXVRPb@d@`C~CfCnDrAhB|AvBvBvCbCfDdB~BtAjBtAhB\\b@Zd@t@dAf@r@Zf@`@p@Xh@^z@Zv@N^x@xBvB~FZp@R`@R`@T\\JPNPX\\XXVTZT\\Tb@V"},"start_location":{"lat":28.571361,"lng":77.13584019999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.6 km","value":4579},"duration":{"text":"5 mins","value":290},"end_location":{"lat":28.5105249,"lng":77.09385859999999},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-left","polyline":{"points":"gyemDefuuM^PPFh@T`A\\jMvEzH~Cv@d@^VZXNNNPNPRVPXT\\NZR^d@dAnP~`@bB`EzBrFd@hALXR`@`@v@X^Z^VX\\ZZVZTRNn@^bQlKvMdIhWlO`@T^TVL@@RLfAn@fAn@bC|Ad@V~ChBhE~BRLdAl@lAt@hAn@jDrBbD`Bv@d@zAz@ZRTLTJVHzA^j@Fd@B^BlADx@Av@ErAUj@Mx@UfAc@|@g@"},"start_location":{"lat":28.5430752,"lng":77.1185909},"travel_mode":"DRIVING"},{"distance":{"text":"5.7 km","value":5689},"duration":{"text":"5 mins","value":325},"end_location":{"lat":28.4710643,"lng":77.0606087},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"wm_mDskpuM`CaA`Ac@hAe@pD_Ab@GfB]VCb@Gj@Eb@?l@?^@l@Bj@Fr@LZHTFXJ`@L^PRJTJVPXNVP`@ZpDrCvDtCvAbA`Av@hBtAdA|@dDtCr@n@lDbDlDbDlFxEnAnAZVZXnDhDpDjDd@^b@\\lCnC@@~CvChHdHhAhAfNjMbFtEfE`EFDjF~ExArApAnAjAdApDjDzLnLdE`En@l@l@l@b@d@~ArBvBrC\\d@@@b@l@fB`CTX`C~CfFdHhJdMtAnBbB~Bh@n@bC`DPR`@l@JJ"},"start_location":{"lat":28.5105249,"lng":77.09385859999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":286},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.4692525,"lng":77.0585586},"html_instructions":"Take exit <b>7<\/b> toward <b>Sector Rd<\/b><div style=\"font-size:0.9em\">Pass by Hero Moto (on the left)<\/div>","maneuver":"ramp-left","polyline":{"points":"cwwlDy{iuMFDHBFDJFHFNJ\\d@jF|G^h@"},"start_location":{"lat":28.4710643,"lng":77.0606087},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1802},"duration":{"text":"4 mins","value":247},"end_location":{"lat":28.4584013,"lng":77.0713483},"html_instructions":"Turn <b>left<\/b> onto <b>Sector Rd<\/b>","maneuver":"turn-left","polyline":{"points":"ykwlD_oiuMXHPH\\VVN@@D@DBHBJ?F?@?LGr@k@`@_APg@Xi@Zm@d@o@LU|CoEt@eA@AbFcHFIh@u@h@u@\\a@rAiBjJkMxEuGRYnFuHpF_IdA{A"},"start_location":{"lat":28.4692525,"lng":77.0585586},"travel_mode":"DRIVING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.4582889,"lng":77.07162079999999},"html_instructions":"Slight <b>left<\/b> to stay on <b>Sector Rd<\/b>","maneuver":"turn-slight-left","polyline":{"points":"_hulD}~kuMHUFSBK"},"start_location":{"lat":28.4584013,"lng":77.0713483},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":151},"duration":{"text":"1 min","value":70},"end_location":{"lat":28.4594098,"lng":77.0724788},"html_instructions":"Turn <b>left<\/b> at <b>Arya Samaj Rd<\/b>/<b>Netaji Subhash Marg<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"igulDs`luMa@]g@[MGMGUKIG]Y]Y]Y"},"start_location":{"lat":28.4582889,"lng":77.07162079999999},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"som poluline"},"summary":"NH 48","warnings":[],"waypoint_order":[]}]
     * status : OK
     */

    private String status;
    private List<GeocodedWaypointsBean> geocoded_waypoints;
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        /**
         * geocoder_status : OK
         * place_id : ChIJtSPDWvLlDDkRctaNu6KvltQ
         * types : ["political","sublocality","sublocality_level_1"]
         */

        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * bounds : {"northeast":{"lat":28.5870716,"lng":77.3739903},"southwest":{"lat":28.4582889,"lng":77.05819679999999}}
         * copyrights : Map data ©2018 Google
         * legs : [{"distance":{"text":"45.4 km","value":45408},"duration":{"text":"1 hour 9 mins","value":4144},"end_address":"Delhi, Sector 29, Gurugram, Haryana 122007, India","end_location":{"lat":28.4594098,"lng":77.0724788},"start_address":"Sector 49, Noida, Uttar Pradesh, India","start_location":{"lat":28.5627292,"lng":77.3739903},"steps":[{"distance":{"text":"0.3 km","value":300},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5616428,"lng":77.3723012},"html_instructions":"Head <b>west<\/b>","polyline":{"points":"atimDmbgwM@PDp@BfB@F@JB\\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A"},"start_location":{"lat":28.5627292,"lng":77.3739903},"travel_mode":"DRIVING"},{"distance":{"text":"61 m","value":61},"duration":{"text":"1 min","value":23},"end_location":{"lat":28.5611088,"lng":77.3721545},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"gmimD{wfwMhB\\"},"start_location":{"lat":28.5616428,"lng":77.3723012},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":96},"duration":{"text":"1 min","value":37},"end_location":{"lat":28.5613842,"lng":77.37122459999999},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"}iimD}vfwMCNq@hD"},"start_location":{"lat":28.5611088,"lng":77.3721545},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":196},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.559862,"lng":77.3702292},"html_instructions":"Turn <b>left<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skimDcqfwMFDFFDDXTHHJJFD@@LF`Ab@nCpA"},"start_location":{"lat":28.5613842,"lng":77.37122459999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":44},"end_location":{"lat":28.5602486,"lng":77.36938049999999},"html_instructions":"Turn <b>right<\/b> onto <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"cbimD}jfwMLNILIHU^Wd@Sl@EL"},"start_location":{"lat":28.559862,"lng":77.3702292},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1182},"duration":{"text":"3 mins","value":159},"end_location":{"lat":28.5612915,"lng":77.3573722},"html_instructions":"Continue straight to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 800&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"qdimDsefwMGVOp@Qv@Ix@?TCl@?TAt@Bb@ALKdBMvBEn@C`BAVIdDIbCGtAGjA?TGdDAd@Ch@SpDM~CKhDQfK"},"start_location":{"lat":28.5602486,"lng":77.36938049999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":324},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.561512,"lng":77.3540692},"html_instructions":"Continue straight past Indian Oil Petrol Pump to stay on <b>Dadri Main Rd<\/b>","maneuver":"straight","polyline":{"points":"akimDqzcwMANGtBKvBGjBMhH"},"start_location":{"lat":28.5612915,"lng":77.3573722},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":540},"duration":{"text":"1 min","value":43},"end_location":{"lat":28.5612479,"lng":77.3485965},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b>","maneuver":"keep-left","polyline":{"points":"mlimD}ecwMIvDUbGClA?h@DdAHpALtALrAj@nE"},"start_location":{"lat":28.561512,"lng":77.3540692},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":695},"duration":{"text":"1 min","value":83},"end_location":{"lat":28.5603155,"lng":77.3415799},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by Ashoka Mission Public School (on the left in 500&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"yjimDwcbwMfA~KJ`BDVFl@TdEXxCLrAR~BJnAB~@AXCp@Cb@"},"start_location":{"lat":28.5612479,"lng":77.3485965},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":332},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5615885,"lng":77.33863029999999},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Amrapali Marg<\/b>","polyline":{"points":"_eimD{w`wMNb@OhAQt@WdAQb@Sb@a@t@g@v@e@v@Q`@CHg@hA"},"start_location":{"lat":28.5603155,"lng":77.3415799},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":145},"duration":{"text":"1 min","value":33},"end_location":{"lat":28.560991,"lng":77.3373106},"html_instructions":"Turn <b>left<\/b> after Police Chowki Sector-37 (on the left)","maneuver":"turn-left","polyline":{"points":"}limDme`wMb@dB?@rA~C"},"start_location":{"lat":28.5615885,"lng":77.33863029999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":975},"duration":{"text":"2 mins","value":90},"end_location":{"lat":28.5574711,"lng":77.3281682},"html_instructions":"Continue straight to stay on <b>Amrapali Marg<\/b><div style=\"font-size:0.9em\">Pass by Pearls Gateway Towers (on the left)<\/div>","maneuver":"straight","polyline":{"points":"eiimDe}_wM^pAz@rDLh@t@lCjAdExBfIBJX|@dAjDfB`GVz@z@tC\\fAZdA"},"start_location":{"lat":28.560991,"lng":77.3373106},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":468},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5555391,"lng":77.32392589999999},"html_instructions":"Continue onto <b>Maha Maya Flyover<\/b>","polyline":{"points":"eshmDad~vMHXHVdApDdAjDTv@Vt@`@hA`@hAl@pA`AjB"},"start_location":{"lat":28.5574711,"lng":77.3281682},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":824},"duration":{"text":"1 min","value":71},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Take the ramp onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"cghmDqi}vMl@`@PFJDLBTBJ?HAFAJEHCHGNKFIHMHUDQ@K@M?OCUCQEOKSOOYW_@UsAw@c@OUCU@WHIFIDKDOBy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.5555391,"lng":77.32392589999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":93},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSJaCvAoC`BYT]VWRaAd@]TMJGDA@CBKFIFe@\\KFcEnCgD~BkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit toward <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit toward <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue toward <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.9 km","value":1869},"duration":{"text":"2 mins","value":104},"end_location":{"lat":28.5722841,"lng":77.2092977},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZv@pAVb@Vb@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Jj@J`ADfAFrE@`OHp@DVHRBDDFFDHBZDl@J`@L"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":245},"duration":{"text":"1 min","value":26},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"wokmDc}fvMXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5722841,"lng":77.2092977},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the ramp onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":317},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5780024,"lng":77.17615409999999},"html_instructions":"Take the exit toward <b>Rao Tularam Marg<\/b>","maneuver":"ramp-left","polyline":{"points":"_dlmDyw`vMKPEDQL}@h@aAf@sAn@kAj@sBbAGD_@ROH"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1494},"duration":{"text":"4 mins","value":221},"end_location":{"lat":28.5724344,"lng":77.16255120000001},"html_instructions":"Turn <b>left<\/b> onto <b>Rao Tularam Marg<\/b><div style=\"font-size:0.9em\">Pass by Kendriya Vidyalaya (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"oslmD}m`vMS^KTITCXKVJXp@tBpArDhAzCrBvFFRv@~BtCrIrAtDDNhBlFVr@DLzDvKZ|@h@~AjBlFDJXz@"},"start_location":{"lat":28.5780024,"lng":77.17615409999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1754},"duration":{"text":"5 mins","value":295},"end_location":{"lat":28.5749652,"lng":77.1472837},"html_instructions":"Turn <b>right<\/b> to stay on <b>Rao Tularam Marg<\/b>","maneuver":"turn-right","polyline":{"points":"upkmD}x}uM`@jAHTFL@BBDHTIDKH{A|@g@ZWNq@`@QLWNeDrBc@X[TYRMJST_@^[`@QPKRKRa@`ACPEVKr@Gp@ARAX?X?`@@l@?N@J@RBRDTBJ?B?B?@?@AJn@~AHVRl@j@fB`AbDb@jA|ArH@P@T?Z?D?f@Gb@ADAFGr@OhAMn@M`AW~BY`DMjAe@dFSjA"},"start_location":{"lat":28.5724344,"lng":77.16255120000001},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1246},"duration":{"text":"1 min","value":84},"end_location":{"lat":28.571361,"lng":77.13584019999999},"html_instructions":"Take the ramp on the <b>right<\/b> onto <b>NH 48<\/b>","polyline":{"points":"q`lmDoyzuMIVEVOlAe@hEMvACf@Cj@?`@@`@B^B`@Jn@H^Tz@Xx@v@rBFN\\|@@J@HBd@Nj@@DJ^h@pBVz@X~@^jA|@`Cb@bAXl@Xl@NXzCzFp@lA\\j@jArB"},"start_location":{"lat":28.5749652,"lng":77.1472837},"travel_mode":"DRIVING"},{"distance":{"text":"3.8 km","value":3818},"duration":{"text":"4 mins","value":236},"end_location":{"lat":28.5430752,"lng":77.1185909},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"_jkmD_rxuMDNHNPZHHBBXZXZLJx@n@NHTLr@\\@?f@NXHh@J^Fb@Db@BdAFpHLH?H?|DLjBD`]z@tBHb@Br@HpAPx@NjATxCn@bEv@^H~A^bFlAnBh@tCt@xBp@RFZLv@`@t@b@RPXVRPb@d@`C~CfCnDrAhB|AvBvBvCbCfDdB~BtAjBtAhB\\b@Zd@t@dAf@r@Zf@`@p@Xh@^z@Zv@N^x@xBvB~FZp@R`@R`@T\\JPNPX\\XXVTZT\\Tb@V"},"start_location":{"lat":28.571361,"lng":77.13584019999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.6 km","value":4579},"duration":{"text":"5 mins","value":290},"end_location":{"lat":28.5105249,"lng":77.09385859999999},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-left","polyline":{"points":"gyemDefuuM^PPFh@T`A\\jMvEzH~Cv@d@^VZXNNNPNPRVPXT\\NZR^d@dAnP~`@bB`EzBrFd@hALXR`@`@v@X^Z^VX\\ZZVZTRNn@^bQlKvMdIhWlO`@T^TVL@@RLfAn@fAn@bC|Ad@V~ChBhE~BRLdAl@lAt@hAn@jDrBbD`Bv@d@zAz@ZRTLTJVHzA^j@Fd@B^BlADx@Av@ErAUj@Mx@UfAc@|@g@"},"start_location":{"lat":28.5430752,"lng":77.1185909},"travel_mode":"DRIVING"},{"distance":{"text":"5.7 km","value":5689},"duration":{"text":"5 mins","value":325},"end_location":{"lat":28.4710643,"lng":77.0606087},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"wm_mDskpuM`CaA`Ac@hAe@pD_Ab@GfB]VCb@Gj@Eb@?l@?^@l@Bj@Fr@LZHTFXJ`@L^PRJTJVPXNVP`@ZpDrCvDtCvAbA`Av@hBtAdA|@dDtCr@n@lDbDlDbDlFxEnAnAZVZXnDhDpDjDd@^b@\\lCnC@@~CvChHdHhAhAfNjMbFtEfE`EFDjF~ExArApAnAjAdApDjDzLnLdE`En@l@l@l@b@d@~ArBvBrC\\d@@@b@l@fB`CTX`C~CfFdHhJdMtAnBbB~Bh@n@bC`DPR`@l@JJ"},"start_location":{"lat":28.5105249,"lng":77.09385859999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":286},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.4692525,"lng":77.0585586},"html_instructions":"Take exit <b>7<\/b> toward <b>Sector Rd<\/b><div style=\"font-size:0.9em\">Pass by Hero Moto (on the left)<\/div>","maneuver":"ramp-left","polyline":{"points":"cwwlDy{iuMFDHBFDJFHFNJ\\d@jF|G^h@"},"start_location":{"lat":28.4710643,"lng":77.0606087},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1802},"duration":{"text":"4 mins","value":247},"end_location":{"lat":28.4584013,"lng":77.0713483},"html_instructions":"Turn <b>left<\/b> onto <b>Sector Rd<\/b>","maneuver":"turn-left","polyline":{"points":"ykwlD_oiuMXHPH\\VVN@@D@DBHBJ?F?@?LGr@k@`@_APg@Xi@Zm@d@o@LU|CoEt@eA@AbFcHFIh@u@h@u@\\a@rAiBjJkMxEuGRYnFuHpF_IdA{A"},"start_location":{"lat":28.4692525,"lng":77.0585586},"travel_mode":"DRIVING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.4582889,"lng":77.07162079999999},"html_instructions":"Slight <b>left<\/b> to stay on <b>Sector Rd<\/b>","maneuver":"turn-slight-left","polyline":{"points":"_hulD}~kuMHUFSBK"},"start_location":{"lat":28.4584013,"lng":77.0713483},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":151},"duration":{"text":"1 min","value":70},"end_location":{"lat":28.4594098,"lng":77.0724788},"html_instructions":"Turn <b>left<\/b> at <b>Arya Samaj Rd<\/b>/<b>Netaji Subhash Marg<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"igulDs`luMa@]g@[MGMGUKIG]Y]Y]Y"},"start_location":{"lat":28.4582889,"lng":77.07162079999999},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"som poluline"}
         * summary : NH 48
         * warnings : []
         * waypoint_order : []
         */

        private BoundsBean bounds;
        private String copyrights;
        private OverviewPolylineBean overview_polyline;
        private String summary;
        private List<LegsBean> legs;
        private List<?> warnings;
        private List<?> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<?> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<?> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<?> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":28.5870716,"lng":77.3739903}
             * southwest : {"lat":28.4582889,"lng":77.05819679999999}
             */

            private NortheastBean northeast;
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 28.5870716
                 * lng : 77.3739903
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 28.4582889
                 * lng : 77.05819679999999
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean {
            /**
             * points : som poluline
             */

            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * distance : {"text":"45.4 km","value":45408}
             * duration : {"text":"1 hour 9 mins","value":4144}
             * end_address : Delhi, Sector 29, Gurugram, Haryana 122007, India
             * end_location : {"lat":28.4594098,"lng":77.0724788}
             * start_address : Sector 49, Noida, Uttar Pradesh, India
             * start_location : {"lat":28.5627292,"lng":77.3739903}
             * steps : [{"distance":{"text":"0.3 km","value":300},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5616428,"lng":77.3723012},"html_instructions":"Head <b>west<\/b>","polyline":{"points":"atimDmbgwM@PDp@BfB@F@JB\\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A"},"start_location":{"lat":28.5627292,"lng":77.3739903},"travel_mode":"DRIVING"},{"distance":{"text":"61 m","value":61},"duration":{"text":"1 min","value":23},"end_location":{"lat":28.5611088,"lng":77.3721545},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"gmimD{wfwMhB\\"},"start_location":{"lat":28.5616428,"lng":77.3723012},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":96},"duration":{"text":"1 min","value":37},"end_location":{"lat":28.5613842,"lng":77.37122459999999},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"}iimD}vfwMCNq@hD"},"start_location":{"lat":28.5611088,"lng":77.3721545},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":196},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.559862,"lng":77.3702292},"html_instructions":"Turn <b>left<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skimDcqfwMFDFFDDXTHHJJFD@@LF`Ab@nCpA"},"start_location":{"lat":28.5613842,"lng":77.37122459999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":44},"end_location":{"lat":28.5602486,"lng":77.36938049999999},"html_instructions":"Turn <b>right<\/b> onto <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"cbimD}jfwMLNILIHU^Wd@Sl@EL"},"start_location":{"lat":28.559862,"lng":77.3702292},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1182},"duration":{"text":"3 mins","value":159},"end_location":{"lat":28.5612915,"lng":77.3573722},"html_instructions":"Continue straight to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 800&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"qdimDsefwMGVOp@Qv@Ix@?TCl@?TAt@Bb@ALKdBMvBEn@C`BAVIdDIbCGtAGjA?TGdDAd@Ch@SpDM~CKhDQfK"},"start_location":{"lat":28.5602486,"lng":77.36938049999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":324},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.561512,"lng":77.3540692},"html_instructions":"Continue straight past Indian Oil Petrol Pump to stay on <b>Dadri Main Rd<\/b>","maneuver":"straight","polyline":{"points":"akimDqzcwMANGtBKvBGjBMhH"},"start_location":{"lat":28.5612915,"lng":77.3573722},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":540},"duration":{"text":"1 min","value":43},"end_location":{"lat":28.5612479,"lng":77.3485965},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b>","maneuver":"keep-left","polyline":{"points":"mlimD}ecwMIvDUbGClA?h@DdAHpALtALrAj@nE"},"start_location":{"lat":28.561512,"lng":77.3540692},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":695},"duration":{"text":"1 min","value":83},"end_location":{"lat":28.5603155,"lng":77.3415799},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by Ashoka Mission Public School (on the left in 500&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"yjimDwcbwMfA~KJ`BDVFl@TdEXxCLrAR~BJnAB~@AXCp@Cb@"},"start_location":{"lat":28.5612479,"lng":77.3485965},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":332},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5615885,"lng":77.33863029999999},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Amrapali Marg<\/b>","polyline":{"points":"_eimD{w`wMNb@OhAQt@WdAQb@Sb@a@t@g@v@e@v@Q`@CHg@hA"},"start_location":{"lat":28.5603155,"lng":77.3415799},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":145},"duration":{"text":"1 min","value":33},"end_location":{"lat":28.560991,"lng":77.3373106},"html_instructions":"Turn <b>left<\/b> after Police Chowki Sector-37 (on the left)","maneuver":"turn-left","polyline":{"points":"}limDme`wMb@dB?@rA~C"},"start_location":{"lat":28.5615885,"lng":77.33863029999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":975},"duration":{"text":"2 mins","value":90},"end_location":{"lat":28.5574711,"lng":77.3281682},"html_instructions":"Continue straight to stay on <b>Amrapali Marg<\/b><div style=\"font-size:0.9em\">Pass by Pearls Gateway Towers (on the left)<\/div>","maneuver":"straight","polyline":{"points":"eiimDe}_wM^pAz@rDLh@t@lCjAdExBfIBJX|@dAjDfB`GVz@z@tC\\fAZdA"},"start_location":{"lat":28.560991,"lng":77.3373106},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":468},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5555391,"lng":77.32392589999999},"html_instructions":"Continue onto <b>Maha Maya Flyover<\/b>","polyline":{"points":"eshmDad~vMHXHVdApDdAjDTv@Vt@`@hA`@hAl@pA`AjB"},"start_location":{"lat":28.5574711,"lng":77.3281682},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":824},"duration":{"text":"1 min","value":71},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Take the ramp onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"cghmDqi}vMl@`@PFJDLBTBJ?HAFAJEHCHGNKFIHMHUDQ@K@M?OCUCQEOKSOOYW_@UsAw@c@OUCU@WHIFIDKDOBy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.5555391,"lng":77.32392589999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":93},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSJaCvAoC`BYT]VWRaAd@]TMJGDA@CBKFIFe@\\KFcEnCgD~BkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit toward <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit toward <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue toward <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.9 km","value":1869},"duration":{"text":"2 mins","value":104},"end_location":{"lat":28.5722841,"lng":77.2092977},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZv@pAVb@Vb@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Jj@J`ADfAFrE@`OHp@DVHRBDDFFDHBZDl@J`@L"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":245},"duration":{"text":"1 min","value":26},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"wokmDc}fvMXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5722841,"lng":77.2092977},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the ramp onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":317},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5780024,"lng":77.17615409999999},"html_instructions":"Take the exit toward <b>Rao Tularam Marg<\/b>","maneuver":"ramp-left","polyline":{"points":"_dlmDyw`vMKPEDQL}@h@aAf@sAn@kAj@sBbAGD_@ROH"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"1.5 km","value":1494},"duration":{"text":"4 mins","value":221},"end_location":{"lat":28.5724344,"lng":77.16255120000001},"html_instructions":"Turn <b>left<\/b> onto <b>Rao Tularam Marg<\/b><div style=\"font-size:0.9em\">Pass by Kendriya Vidyalaya (on the left in 1.4&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"oslmD}m`vMS^KTITCXKVJXp@tBpArDhAzCrBvFFRv@~BtCrIrAtDDNhBlFVr@DLzDvKZ|@h@~AjBlFDJXz@"},"start_location":{"lat":28.5780024,"lng":77.17615409999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1754},"duration":{"text":"5 mins","value":295},"end_location":{"lat":28.5749652,"lng":77.1472837},"html_instructions":"Turn <b>right<\/b> to stay on <b>Rao Tularam Marg<\/b>","maneuver":"turn-right","polyline":{"points":"upkmD}x}uM`@jAHTFL@BBDHTIDKH{A|@g@ZWNq@`@QLWNeDrBc@X[TYRMJST_@^[`@QPKRKRa@`ACPEVKr@Gp@ARAX?X?`@@l@?N@J@RBRDTBJ?B?B?@?@AJn@~AHVRl@j@fB`AbDb@jA|ArH@P@T?Z?D?f@Gb@ADAFGr@OhAMn@M`AW~BY`DMjAe@dFSjA"},"start_location":{"lat":28.5724344,"lng":77.16255120000001},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1246},"duration":{"text":"1 min","value":84},"end_location":{"lat":28.571361,"lng":77.13584019999999},"html_instructions":"Take the ramp on the <b>right<\/b> onto <b>NH 48<\/b>","polyline":{"points":"q`lmDoyzuMIVEVOlAe@hEMvACf@Cj@?`@@`@B^B`@Jn@H^Tz@Xx@v@rBFN\\|@@J@HBd@Nj@@DJ^h@pBVz@X~@^jA|@`Cb@bAXl@Xl@NXzCzFp@lA\\j@jArB"},"start_location":{"lat":28.5749652,"lng":77.1472837},"travel_mode":"DRIVING"},{"distance":{"text":"3.8 km","value":3818},"duration":{"text":"4 mins","value":236},"end_location":{"lat":28.5430752,"lng":77.1185909},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"_jkmD_rxuMDNHNPZHHBBXZXZLJx@n@NHTLr@\\@?f@NXHh@J^Fb@Db@BdAFpHLH?H?|DLjBD`]z@tBHb@Br@HpAPx@NjATxCn@bEv@^H~A^bFlAnBh@tCt@xBp@RFZLv@`@t@b@RPXVRPb@d@`C~CfCnDrAhB|AvBvBvCbCfDdB~BtAjBtAhB\\b@Zd@t@dAf@r@Zf@`@p@Xh@^z@Zv@N^x@xBvB~FZp@R`@R`@T\\JPNPX\\XXVTZT\\Tb@V"},"start_location":{"lat":28.571361,"lng":77.13584019999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.6 km","value":4579},"duration":{"text":"5 mins","value":290},"end_location":{"lat":28.5105249,"lng":77.09385859999999},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-left","polyline":{"points":"gyemDefuuM^PPFh@T`A\\jMvEzH~Cv@d@^VZXNNNPNPRVPXT\\NZR^d@dAnP~`@bB`EzBrFd@hALXR`@`@v@X^Z^VX\\ZZVZTRNn@^bQlKvMdIhWlO`@T^TVL@@RLfAn@fAn@bC|Ad@V~ChBhE~BRLdAl@lAt@hAn@jDrBbD`Bv@d@zAz@ZRTLTJVHzA^j@Fd@B^BlADx@Av@ErAUj@Mx@UfAc@|@g@"},"start_location":{"lat":28.5430752,"lng":77.1185909},"travel_mode":"DRIVING"},{"distance":{"text":"5.7 km","value":5689},"duration":{"text":"5 mins","value":325},"end_location":{"lat":28.4710643,"lng":77.0606087},"html_instructions":"Keep <b>right<\/b> to stay on <b>NH 48<\/b>","maneuver":"keep-right","polyline":{"points":"wm_mDskpuM`CaA`Ac@hAe@pD_Ab@GfB]VCb@Gj@Eb@?l@?^@l@Bj@Fr@LZHTFXJ`@L^PRJTJVPXNVP`@ZpDrCvDtCvAbA`Av@hBtAdA|@dDtCr@n@lDbDlDbDlFxEnAnAZVZXnDhDpDjDd@^b@\\lCnC@@~CvChHdHhAhAfNjMbFtEfE`EFDjF~ExArApAnAjAdApDjDzLnLdE`En@l@l@l@b@d@~ArBvBrC\\d@@@b@l@fB`CTX`C~CfFdHhJdMtAnBbB~Bh@n@bC`DPR`@l@JJ"},"start_location":{"lat":28.5105249,"lng":77.09385859999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":286},"duration":{"text":"1 min","value":24},"end_location":{"lat":28.4692525,"lng":77.0585586},"html_instructions":"Take exit <b>7<\/b> toward <b>Sector Rd<\/b><div style=\"font-size:0.9em\">Pass by Hero Moto (on the left)<\/div>","maneuver":"ramp-left","polyline":{"points":"cwwlDy{iuMFDHBFDJFHFNJ\\d@jF|G^h@"},"start_location":{"lat":28.4710643,"lng":77.0606087},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1802},"duration":{"text":"4 mins","value":247},"end_location":{"lat":28.4584013,"lng":77.0713483},"html_instructions":"Turn <b>left<\/b> onto <b>Sector Rd<\/b>","maneuver":"turn-left","polyline":{"points":"ykwlD_oiuMXHPH\\VVN@@D@DBHBJ?F?@?LGr@k@`@_APg@Xi@Zm@d@o@LU|CoEt@eA@AbFcHFIh@u@h@u@\\a@rAiBjJkMxEuGRYnFuHpF_IdA{A"},"start_location":{"lat":28.4692525,"lng":77.0585586},"travel_mode":"DRIVING"},{"distance":{"text":"30 m","value":30},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.4582889,"lng":77.07162079999999},"html_instructions":"Slight <b>left<\/b> to stay on <b>Sector Rd<\/b>","maneuver":"turn-slight-left","polyline":{"points":"_hulD}~kuMHUFSBK"},"start_location":{"lat":28.4584013,"lng":77.0713483},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":151},"duration":{"text":"1 min","value":70},"end_location":{"lat":28.4594098,"lng":77.0724788},"html_instructions":"Turn <b>left<\/b> at <b>Arya Samaj Rd<\/b>/<b>Netaji Subhash Marg<\/b><div style=\"font-size:0.9em\">Destination will be on the right<\/div>","maneuver":"turn-left","polyline":{"points":"igulDs`luMa@]g@[MGMGUKIG]Y]Y]Y"},"start_location":{"lat":28.4582889,"lng":77.07162079999999},"travel_mode":"DRIVING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            private DistanceBean distance;
            private DurationBean duration;
            private String end_address;
            private EndLocationBean end_location;
            private String start_address;
            private StartLocationBean start_location;
            private List<StepsBean> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class DistanceBean {
                /**
                 * text : 45.4 km
                 * value : 45408
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                /**
                 * text : 1 hour 9 mins
                 * value : 4144
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                /**
                 * lat : 28.4594098
                 * lng : 77.0724788
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                /**
                 * lat : 28.5627292
                 * lng : 77.3739903
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBean {
                /**
                 * distance : {"text":"0.3 km","value":300}
                 * duration : {"text":"2 mins","value":98}
                 * end_location : {"lat":28.5616428,"lng":77.3723012}
                 * html_instructions : Head <b>west</b>
                 * polyline : {"points":"atimDmbgwM@PDp@BfB@F@JB\\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A"}
                 * start_location : {"lat":28.5627292,"lng":77.3739903}
                 * travel_mode : DRIVING
                 * maneuver : turn-right
                 */

                private DistanceBeanX distance;
                private DurationBeanX duration;
                private EndLocationBeanX end_location;
                private String html_instructions;
                private PolylineBean polyline;
                private StartLocationBeanX start_location;
                private String travel_mode;
                private String maneuver;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBeanX end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBeanX start_location) {
                    this.start_location = start_location;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public String getManeuver() {
                    return maneuver;
                }

                public void setManeuver(String maneuver) {
                    this.maneuver = maneuver;
                }

                public static class DistanceBeanX {
                    /**
                     * text : 0.3 km
                     * value : 300
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX {
                    /**
                     * text : 2 mins
                     * value : 98
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX {
                    /**
                     * lat : 28.5616428
                     * lng : 77.3723012
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    /**
                     * points : atimDmbgwM@PDp@BfB@F@JB\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A
                     */

                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX {
                    /**
                     * lat : 28.5627292
                     * lng : 77.3739903
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }
    }
}
