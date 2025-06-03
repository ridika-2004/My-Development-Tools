from dataclasses import dataclass
from datetime import datetime

@dataclass
class Post:
    title: str
    content: str
    author: str
    created_at: datetime = datetime.now()
    tags: list = None

    def to_dict(self):
        return {
            "title": self.title,
            "content": self.content,
            "author": self.author,
            "created_at": self.created_at,
            "tags": self.tags or [],
        }