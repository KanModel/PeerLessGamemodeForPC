import java.util.*;
import org.bukkit.plugin.java.*;
import com.xingyi.c01.API.*;

public class PeerLessGamemodeForPC extends JavaPlugin
{

	@Override
	public void onEnable()
	{
		setUpPlugin();
	}

	@Override
	public void onDisable()
	{

	}
	public void setUpListener()
	{

	}
	public void setUpSettingManager()
	{
		
	}
	public void setUpAPI()
	{
		GeneralPluginProvider.getInstance().setUpPluginGetter(this);
	}
	public void setUpPlugin()
	{
		setUpAPI();
		setUpListener();
		setUpSettingManager();
	}

}
