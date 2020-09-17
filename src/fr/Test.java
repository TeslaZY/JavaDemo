package fr;

/**
 * @author Tesla.Z
 * @version 10.0
 * Created by Tesla.Z on 2020/9/2
 */
public class Test {
    public static void main(String[] args){
//        String s1 = "999649981999655996339946999258991909889698874987609871898508984479841498413983219815898093980239792797719976889761597608973829718197134970769676096744966539661396530963469629296221962039597895929958569576495753956519545195421954199529795201951449511895095949909495994714947119451994347941839412793772936209358493500934549339493317932639318993126931069280692725925759255192399921989215492117920409203991952919079184691834917879172191649913339114191137911269105990905908559083690696906309060290546903519030390211901288981889810897758975989674896718959289560895418934589334893338928089201890988905589033890118877688605883008828688205881188808088028879478782687521872148717686940868318666986492864528638686261862518580185787857858564085612855198550785470850718475684741847158468984540844298422084206841608383883817837878366083619835558314483071830408300482493824268223182196821358211482030819918182181773817138166181607815598150181452814058131581291811548105481018809448075380704805688050880475803008024880104799537993979920796647963279268788947884178840786847866678504784927824878203781337811378074780357791177851777287765677597775847754977429773337727877241770907681176691766667649676417763537630076064759967596575856757877576275745757457561575553755107535675208750837506974810745767456974392742897420873870738407372373651736477349473479734487336673333732077317573115730787301772228722017206671896716757161871312710787107671073710027094470885708747083070807706317062170593705657041970389703467026770079700537004169972699036977669720696626959069588692596925269053689746884468740686906852268387683836837568363679936798567965678636785367814676986760767562674976746967452674096721667115670776707567001668776685266828666986664066477663456633866189661776614666138660676601065948658616579865556654956544865447652196489964795644346443364304639216390763836638046370963536632056308963081629696285662727626116259062461624456235362304621136210361984615766145961374613346129861210611466096460589605046047160374603736033660294602656008059946597105958659551594145939259266592035908858956588605881458733584905833258273582295815958076580625786857862577825769057404573645732457221571085710657007569085647456470562325581955787557205562855583555285548155465551305503955028549525492154861548045476554750544255400353931538865386953736534975320253194531605308452390523745203251933519205178751762517085167251659516325150351489513185124850911508655082650522505145037350351503125014150134499174991449888496894958549563494774947249357492194920049095489914891048858488054871748650486094826948117480194787747536474674739547275472344722847194471824703346979469664676246707466714662646617463524623546183461444608045949458884582445798457324566845538454754535345319450474504145026450174493044930449094462044505444214428044182440134398143961437554361643507434324335443284431384290342900428794285442843427844267842549424744237542279421514161841594413944125741200410644101740904408174068740659405934058840588404334035140211399823986939777396573960539566395523932739259392513918939131387253862738622385813844638385383823837238019378633786037696376813767337570373773727437254371093688836882365483651436465364543634936205361153611135980359773588935711355643555635525353883536335118351023506735052349543482234767346423442634369342913414234105338803386533737335563327633176331253312333075327013256932524323683228732252322103212132025318323181631699316853166731646315343145731430311723111630999307693064330508304143039330368303573033530327302123015430015300002990729903298182947329411293772932929161291322910329069290452898428933288782865128650286052832628160281312812728110280852793727801277312760827394273322733127236271132677326732267042663426618265912600025966258332580125773257342567525656256382549325411253272525525248251922509925023249972469924558243952438224305242392400924008237332372823692235812357123518230762299622676224032239922365223112229822243220582198721892218542184121745217162167221491214402124021004209792095520941208512073020721206532059420042200311980119680196791951319498194131925719225190781869718535185041826418253182341813317868178531780317748176671759217399171821688616885167541669116246162071615816108158681586115823156811547615474154111535615278151931501114975147901469714592144301433614280141821395513912137611368513354132151304713013127431270212574125181250612487124801243212410122571214012118120001193211907118911187611814116421152411474113891127510986109531094310940108591078410741106871060310500104601038710158100771001498069712968795639262920791929022896289118543843782668181812881097984796879127788774677207614758274607213709570946990693568506752670265986419636263176204615560276021585956985511546054395429533552164927491348684693465846244406417441614087377635783452328631703017282127782738273426552437230822042174214421412036192418941884183916711538138311041054921890791694681673592575553537395127";
//        String s2 = "999649981999655996339946999258991909889698874987609871898508984479841498413983219815898093980698023979279771997688976159760897382971819713497129707696879676096744966539661396530963469629296221962039597895929958569576495753956519563954519542195419952979520195144951189509594990949599471494711945199434794183941279377293620935849350093454933949331793263931899312693106928069272592629257592551923999219892192154921179207920409203991952919291907918469183491787917219164991333911419113791126910599090590855908369069690630906029054690351903039022902119012889818898108977589759896748967189628959289560895418934589334893338928089201891189098890890558903389011887768860588300882868820588118880808802887947878268752187214871768694086831866698649286452863868626186251858018578785785856408561285519855078547085438507184756847418471584689845408442984378422084206841608383883817837878366083619835558314483071830408300482668249382426822318219682135821148203081991818218181817738171381661816078155981501814528140581315812918128811548109810548101880944807538070480568805088047580300802488010479953799397992079847968796647963279268791791278894788417884078684786667850478492782487820378133781137807478035779117788778517772877656775977758477549774677429773337727877241772077090768117669176666764967641776353763007614760647599675965758567582757877576275745757457561575553755107535675208750837506974810746074576745697439274289742087387073840737237365173647734947347973448733667333373207731757311573078730177222872201721372066718967167571618713127107871076710737100270957094709447088570874708307080770631706217059370565704197038970346702677007970053700416997269906990369776697206966269590695886946935692596925269053689746884468740686906852268506838768383683756836368167993679856796567863678536781467698676076756267526749767469674526740967367216671156707767075670267001668776685266828666986664066477663456633866189661776614666138660676601065986594865861657986555665495654486544765219648996479564434644336430464196392163907638366380463709636263536632056317630896308162969628566272762611625906246162445623536230462113621036204619846157661556145961374613346129861210611466096460589605046047160374603736033660294602760265602160080599465971059586595515941459392592665925920359088589565886058814587335859584905833258273582295815958076580625786857862577825769057557404573645732457221571085710657007569856908564745647056232558195578755720556285558355528554815546555355130551155039550285495254921548615480454765547505460544255439542954003539315388653869537537365349753355320253194531605308452390523745216520325193351920517875176251708516725165951632515035148951318512485091150865508265052250514503735035150312501415013449917499144988849689495854956349477494724935749274921949200491349095489914891048858488054871748684865048609482694811748019478774753647467473954727547234472284719447182470334697946966469346762467074667146626466174658463524624462354618346144460804594945888458244579845732456684553845475453534531945047450414502645017449304493044909446204450544421442804418244064401343981439614375543616435074343243354432844313842903429004287942854428434278442678425494247442375422794215141744161841614159441394412574120041064410174090440874081740687406594059340588405884043340351402113998239869397773965739605395663955239539327392593925139189391313872538627386223858138446383853838238372380193786337860377637696376813767337570373773727437254371093688836882365483651436465364543634936205361153611135980359773588935783571135564355563552535388353633511835102350673505234954348223476734642345234426343693429134142341053388033865337373355633276331763312533123330753286327013256932524323683228732252322103212132025318323181631703169931685316673164631534314573143031172311163099930769306433050830414303933036830357303353032730212301730154300153000029907299032981829473294112937729329291612913229103290692904528984289332887828651286502860528326282128160281312812728110280852793727801277827731276082739427382734273322733127236271132677326732267042663426618265912655260002596625833258012577325734256752565625638254932541125327252552524825192250992502324997246992455824395243822437243052423924009240082373323728236922358123571235182308230762299622676224032239922365223112229822243220582204219872189221854218412174521742171621672214912144214402141212402100420979209552094120851207302072120653205942036200422003119801196801967919513194981941319257192419225190781894188418697185351850418391826418253182341813317868178531780317748176671759217399171821688616885167541671166911624616207161581610815868158611582315681154761547415411153815356152781519315011149751479014697145921443014336142801418213955139121383137611368513354132151304713013127431271270212574125181250612487124801243212410122571214012118120001193211907118911187611814116421152411474113891127511041098610953109431094010859107841074110687106031054105001046010387101581007710014";
        long result = Long.valueOf("4294967296") %Long.valueOf("971646509461160317");
//        if(s1.equals(s2)){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
        return;
    }
}