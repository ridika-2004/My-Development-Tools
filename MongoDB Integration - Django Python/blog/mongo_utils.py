from pymongo import MongoClient
from django.conf import settings

# MongoDB Connection
client = MongoClient("mongodb://localhost:27017/")
db = client["blogdb"]  # Your database name

# Collections (equivalent to SQL tables)
posts_collection = db["posts"]