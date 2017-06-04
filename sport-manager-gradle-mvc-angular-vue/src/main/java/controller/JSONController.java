package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import object.Player;

/**
 * JsonControler get {@link Player} by request / page
 * 
 * @version 1.0
 * @author aka47
 *
 */
@RestController
public class JSONController {

	private List<Player> players = new ArrayList<>();

	@RequestMapping({ "/", "/home" })
	public ModelAndView showHomePage(Locale locale, Model model) {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/player", method = RequestMethod.GET)
	public @ResponseBody Player getTask() {
		Player player = new Player(12L, "Name");
		return player;
	}

	// @RequestMapping(value = "/settasks", method = RequestMethod.POST,
	// params="hasCustomerName=true")
	// @RequestMapping(value = "/settasks", method = RequestMethod.POST)
	// public String postDelivery(
	// @ModelAttribute("deliveryDtoAttribute") DeliveryDto deliveryDto,
	// BindingResult result,
	// ModelMap model) {
	//
	// model.addAttribute("deliveryDtoAttribute", deliveryDto);
	//
	// model.addAttribute("customerNameList",
	// customerService.listAllCustomerNames());
	// model.addAttribute("customerCountryList",
	// customerService.listAllCustomerCountries(deliveryDto.getCustomerName()));
	//
	// return "new-delivery";
	// }

	@RequestMapping(value = "/setplayers", method = RequestMethod.POST)
	public String updateHosting(@RequestBody String atrr) {
		players.add(new Player(122L, atrr));
		return "SET" + atrr;
	}

	@RequestMapping(value = "/players", method = RequestMethod.GET)
	public @ResponseBody List<Player> getTasks() {
		players.add(new Player(12L, "Evgeniy"));
		players.add(new Player(13L, "Igor"));
		players.add(new Player(14L, "Vasiya"));

		return players;
	}
}