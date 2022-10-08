package stringBoot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class Controller {

    private final String sharedKey = "SHARED_KEY";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @GetMapping
    public BaseResponse showStatus() {
        return new BaseResponse(SUCCESS_STATUS, 1);
    }



    @PostMapping("/pay")
    public BaseResponse pay(@RequestParam(value = "key") String key, @RequestBody PaymentRequest request) {

        final BaseResponse response;

        if (sharedKey.equalsIgnoreCase(key)) {
            int userId = request.getUserId();
            String itemId = request.getItemId();
            double discount = request.getDiscount();
            // Process the request
            // ....
            // Return success response to the client.
            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else {
            response = new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
        }
        return response;
    }

    @GetMapping ("/gimme")
    public String BaseResponse2 () {

        String response = "____________________██████\n" +
                "_________▓▓▓▓____█████████\n" +
                "______▓▓▓▓▓=▓____▓=▓▓▓▓▓\n" +
                "___▓▓▓_▓▓▓▓░●____●░░▓▓▓▓\n" +
                "_▓▓▓▓_▓▓▓▓▓░░__░░░░▓▓▓▓\n" +
                "__▓▓▓▓_▓▓▓▓░░♥__♥░░░▓▓▓\n" +
                "___▓▓▓___▓▓░░_____░░░▓▓\n" +
                "▓▓▓▓▓____▓░░_____░░▓\n" +
                "_-▓▓_____▒▓▒▓▒____████\n" +
                "________▒▓▒▓▒▓▒__██████\n" +
                "_______▒▓▒▓▒▓▒__████████\n" +
                "______▒▓▒▓▒▓▒__██████ ███\n" +
                "_ _____▒▓▒▓▒▓▒__██████__███\n" +
                "____▓▓X▓▓▓▓▓▓▓__██████__███\n" +
                "___▓▓_██████▓▓__██████__███\n" +
                "___▓_███████▓▓__██████__███\n" +
                "____████████▓▓__██████__███\n" +
                "____████████▓▓__▓▓▓▓▓▓_▒▒\n" +
                "____████████▓▓__▓▓▓▓▓▓\n" +
                "____████████▓▓__▓▓▓▓▓▓\n" +
                "_____████████▓__▓▓▓▓▓▓\n" +
                "________▒▒▒▒▒___▓▓▓▓▓▓\n" +
                "________▒▒▒▒▒____▓▓▓▓▓\n" +
                "________▒▒▒▒▒____▓▓▓▓▓\n" +
                "________▒▒▒▒▒____▓▓▓▓▓\n" +
                "________▒▒▒▒_____▓▓▓▓▓\n" +
                "________█████___█████\n" +
                "_'▀█║────────────▄▄───────────\u200B─▄──▄_\n" +
                "──█║───────▄─▄─█▄▄█║──────▄▄──\u200B█║─█║\n" +
                "──█║───▄▄──█║█║█║─▄║▄──▄║█║─█║\u200B█║▄█║\n" +
                "──█║──█║─█║█║█║─▀▀──█║─█║█║─█║\u200B─▀─▀\n" +
                "──█║▄║█║─█║─▀───────█║▄█║─▀▀\n" +
                "──▀▀▀──▀▀────────────▀─█║\n" +
                "───────▄▄─▄▄▀▀▄▀▀▄──▀▄▄▀\n" +
                "──────███████───▄▀\n" +
                "──────▀█████▀▀▄▀\n" +
                "────────▀█▀\n";
        System.out.println(response);
        return response;

    }
}
