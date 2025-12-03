
public class Card
	{
		private String rank;
		private String type;
		private int value;
		
		
		public Card(String r, String t, int v)
		{
			rank = r;
			type = t;
			value = v;
		
				
		}


		public String getRank()
			{
				return rank;
			}


		public void setRank(String rank)
			{
				this.rank = rank;
			}


		public String getType()
			{
				return type;
			}


		public void setType(String type)
			{
				this.type = type;
			}


		public int getValue()
			{
				return value;
			}


		public void setValue(int value)
			{
				this.value = value;
			}

	}
